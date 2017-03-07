package com.my.action;

import com.my.dao.UserDao;

public class register {
	String userName;
	String password;
	
	public String execute(){
		UserDao dao = new UserDao();
		int key=0;
		key=dao.queryname(userName);
		if(key==1){
			dao.insertUser(userName, password);
			return "ok";
		}
		else
			return "no";
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
