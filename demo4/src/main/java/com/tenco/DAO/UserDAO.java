package com.tenco.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.dbHelper.DBHelper;

public class UserDAO implements IUserDAO{

	private Connection conn;
	private PreparedStatement pstmt; 
	private ResultSet rs;
	
	public UserDAO() {
		conn = DBHelper.getInstance().getConnection();
	}
	
	@Override
	public int join(String userEmail, String userPassword) {
		String sql = " INSERT INTO user "
				+ " VALUES(?, ?) ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userEmail);
			pstmt.setString(2, userPassword);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
