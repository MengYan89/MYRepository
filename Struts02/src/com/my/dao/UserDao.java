package com.my.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.my.util.DBHelper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UserDao {
	private DBHelper dbHelper;
	private Connection conn;
	public UserDao(){
		dbHelper=new DBHelper();		
	}
	public int queryUser(String userName,String password){
		String querySql="select * from users where userName=? and userPwd=?";
		conn=(Connection) dbHelper.getConnection();
		ResultSet resultSet=null;
		try{
			PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(querySql);
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			resultSet=pstmt.executeQuery();
			if(resultSet.next())
				return 1;
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public int queryname(String userName){
		String querySql="select * from users where userName=?";
		conn=(Connection) dbHelper.getConnection();
		ResultSet resultSet=null;
		try{
			PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(querySql);
			pstmt.setString(1, userName);
			resultSet=pstmt.executeQuery();
			if(resultSet.next())
				return 0;
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return 1;
	}
	
	public int insertUser(String userName,String password){
		String insertEmp="insert into users(userName,userPwd) values(?,?)";
		conn=(Connection) dbHelper.getConnection();
		PreparedStatement pstmt;
		int right=0;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(insertEmp);
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			right=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return right;	
	}
	
}
