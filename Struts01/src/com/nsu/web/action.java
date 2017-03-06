package com.nsu.web;

import com.opensymphony.xwork2.ActionSupport;

public class action  {
	String name;
	/**
	 * @return
	 */
	public String execute() {
		if(name.equals("admin"))
		 return "ok";//index.jsp
		else
		 return "failure"; //login.html
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}