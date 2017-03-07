package com.my.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBHelper {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";//SQLServer对应的驱动程序：com.microsoft.jdbc.sqlserver.SQLServerDriver
	private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/javaweb";//SQLServer对应的数据库连接字符串：jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=JIMS
	private static final String USERNAME = "root";
	private static final String PASSWORD = "199689";
	private Connection conn;

	public DBHelper() {
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public Connection getConnection(){
		return this.conn;
	}
	public void close(){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
