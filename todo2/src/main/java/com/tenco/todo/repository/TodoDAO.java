package com.tenco.todo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.utils.DBHelper;

public class TodoDAO implements ITodoDAO {

	private Connection conn;

	public TodoDAO() {
		DBHelper dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public int insert(String title, String description, int priority, int categoryId) {
		int resultCnt = 0;
		String sql = " INSERT INTO todoList(title, description, priority, categoryId) " 
		+ " VALUES(?, ?, ?, ?) ";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, title);
			pstmt.setString(2, description);
			pstmt.setInt(3, priority);
			pstmt.setInt(4, categoryId);

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

		String query = "SELECT * FROM todoList";
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
				boolean completed = rs.getBoolean("completed");
				String createdAt = rs.getString("createdAt");
				int category_id = rs.getInt("category_id");

				TodoDTO todoDTO = new TodoDTO(id, title, description, priority, completed, createdAt, category_id);
				list.add(todoDTO);
			}
		} catch (SQLException e) {
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

	@Override
	public int update(int id, String title) {
		int resultCnt = 0;
		String sql = " UPDATE todoList SET title = ? WHERE id = ? ";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, title);
			
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
}
