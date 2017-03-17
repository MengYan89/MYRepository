package com.nsu.web;

import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class action
{
	
	HttpServletRequest req;
	String name;
	String pwd;
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return
	 */
	public String login() {
		//1.session
		// 2.setAtribte（"yname",name）
		//jsp welcom,${uname}
		if(name.equals("admin") && pwd.equals("123")){
			
			
			//1.第一种方法 *推荐
			Map map=(Map)ActionContext.getContext().get("session");
			map.put("uname", name);
			
			
			
			//map.put("uname", name);
			
			//struts2->login->map->key=request
			//map->request.setAttribute(k,v)
			
			//2.第二种方法
			//ServletActionContext.getRequest().getSession().setAttribute("uname", name); 耦合
			//ServletActionContext.getContext().get("request");
		 return "ok";//index.jsp
		}
		else
		 return "failure"; //login.html
		
	}
	
	
	// 1.login 2.edit
	public String edit() {
		
		 return "edit";//edit.html
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}