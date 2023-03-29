package com.tenco.todo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.utils.DbHelper;

public class CategoryDAO implements ICategoryRepo {

	private Connection conn;
	private DbHelper dbHelper;

	public CategoryDAO() {
		dbHelper = new DbHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<CategoryDTO> select() {

		ArrayList<CategoryDTO> list = new ArrayList<>();

		String strQuery = " SELECT * FROM category ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(strQuery);
			rs = pstmt.executeQuery();

			// 한 번 반복할 때
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");

				// 위의 값들을 dto에 담기
				CategoryDTO dto = new CategoryDTO(id, name);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public int insert(String name) {
		int resultCount = 0;
		String queryStr = " INSERT INTO category(name) VALUES ? ";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, "name");

			resultCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return resultCount;
	}

	@Override
	public int update(int id, String name) {
		int resultCount = 0;
		String queryStr = " UPDATE category SET name = ? WHERE id = ? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			resultCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultCount;
	}
	
	@Override
	public int delete(int id) {
		int resultCount = 0;
		String queryStr = " DELETE FROM category WHERE id = ? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt=conn.prepareStatement(queryStr);
			pstmt.setInt(1, id);
			resultCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return resultCount;
	}


}
