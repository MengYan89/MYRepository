package com.my.action;

import java.sql.ResultSet;
import java.util.Map;

import javax.websocket.Session;

import com.my.dao.UserDao;
import com.opensymphony.xwork2.ActionContext;

public class userAction  {
	String userName;
	String password;
	/**
	 * @return
	 */
	public String LoginAction() {
		Map map=(Map)ActionContext.getContext().get("session");
		if(userName.equals("")||password.equals("")){
			map.put("msg", "账号密码不得为空");
			return "error";
		}
		UserDao dao = new UserDao();
		int key=dao.queryUser(userName, password);
		if(key==1){
			map.put("uname", userName);
		 return "ok";//index.jsp
		}
		else
		{
			map.put("msg", "账号或密码错误");
			return "error"; 
		}
		
	}
	public String RegisterAction(){
		UserDao dao = new UserDao();
		Map map=(Map)ActionContext.getContext().get("session");
		int key=0;
		if(userName.equals("")||password.equals("")){
			map.put("msg", "账号密码不得为空");
			return "error";
		}
		key=dao.queryname(userName);
		if(key==1){
			
			dao.insertUser(userName, password);
			return "ok";
		}
		else
		{
			map.put("msg", "该账号已被人注册");
			return "error";
		}
	}
	
	public String LogoutAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		map.remove("uname");
		return "ok";
	}
	
	public String EditAction(){
		return "ok";
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
