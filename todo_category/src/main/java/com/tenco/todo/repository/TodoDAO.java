package com.tenco.todo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.utils.DbHelper;

public class TodoDAO implements ITodoDAO {

	private Connection conn;

	public TodoDAO() {
		DbHelper dbHelper = new DbHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public int insert(TodoDTO todoDTO) {
		int resultCnt = 0;
		String sql = " INSERT INTO todoList(title, description, priority, categoryId) " 
		+ " VALUES(?, ?, ?, ?) ";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, todoDTO.getTitle());
			pstmt.setString(2, todoDTO.getDescription());
			pstmt.setInt(3, todoDTO.getPriority());
			pstmt.setInt(4, todoDTO.getCategoryId());

			resultCnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert에서 오류가 났어");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				pstmt = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return resultCnt;
	}

	/*
	 * private int id; private String title; private String description; private int
	 * priority; private boolean completed; // 0 : false, 1 : true private String
	 * createdAt; private int category_id;
	 */
	@Override
	public ArrayList<TodoDTO> select() {
		ArrayList<TodoDTO> list = new ArrayList<>();

		String query = " SELECT * FROM todoList ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				int priority = rs.getInt("priority");
				int completed = rs.getInt("completed");
				String createdAt = rs.getString("createdAt");
				int categoryId = rs.getInt("categoryId");

				TodoDTO todoDTO = new TodoDTO(id, title, description, priority, completed, createdAt, categoryId);
				list.add(todoDTO);
			}
		} catch (SQLException e) {
			System.out.println("select에서 오류가 발생했어");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	// 매개변수로 DTO 받기 -> dto.getTitle();
	@Override
	public int update(int id, TodoDTO todoDTO) {
		int resultCnt = 0;
		String sql = " UPDATE todoList SET title=?, description=?, priority=?, categoryId = ? "
				+ " WHERE id=? ";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, todoDTO.getTitle());
			pstmt.setString(2, todoDTO.getDescription());
			pstmt.setInt(3, todoDTO.getPriority());
			pstmt.setInt(4, todoDTO.getCategoryId());
			pstmt.setInt(5, id);
			
			resultCnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update에서 오류가 발생했어");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				pstmt = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return resultCnt;
	}

	@Override
	public int delete(int id) {
		int resultCnt = 0;
		String sql = " DELETE FROM todoList WHERE id = ? ";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			resultCnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return resultCnt;
	}

	@Override
	public ArrayList<CategoryDTO> selectCategoryIdAndTodoId(int categoryId, int id, String name) {
		ArrayList<CategoryDTO> list = new ArrayList<CategoryDTO>();
		
		String sql=" SELECT c.id as cid, t.id as tid, c.name "
				+ " FROM category AS c "
				+ " LEFT JOIN todolist AS t  "
				+ " ON c.id = t.categoryId ";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				categoryId = rs.getInt("categoryId");
				id = rs.getInt("id");
				name = rs.getString("name");
				
				CategoryDTO dto = new CategoryDTO(categoryId, id, name);
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("selectCategoryIdAndTodoId에서 오류가 발생했어");
			e.printStackTrace();
		}
		
		return list;
	}
}
