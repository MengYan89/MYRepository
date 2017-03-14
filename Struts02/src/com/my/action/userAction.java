package com.my.action;

import java.sql.ResultSet;
import java.util.Map;

import com.my.dao.UserDao;
import com.opensymphony.xwork2.ActionContext;

public class userAction  {
	String userName;
	String password;
	/**
	 * @return
	 */
	public String LoginAction() {
		UserDao dao = new UserDao();
		int key=dao.queryUser(userName, password);
		if(key==1){
			Map map=(Map)ActionContext.getContext().get("session");
			map.put("uname", userName);
		 return "ok";//index.jsp
		}
		else
		 return "no"; //login.html
		
	}
	public String RegisterAction(){
		UserDao dao = new UserDao();
		int key=0;
		key=dao.queryname(userName);
		if(key==1){
			
			dao.insertUser(userName, password);
			return "ok";
		}
		else
			return "error";
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
