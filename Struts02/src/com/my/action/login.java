package com.my.action;

import java.sql.ResultSet;

import com.my.dao.UserDao;

public class login  {
	String userName;
	String password;
	/**
	 * @return
	 */
	public String execute() {
		UserDao dao = new UserDao();
		int key=dao.queryUser(userName, password);
		if(key==1)
		 return "ok";//index.jsp
		else
		 return "no"; //login.html
		
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
