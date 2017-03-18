package com.my.action;

import java.util.Map;

import com.my.dao.AdminDao;
import com.my.entity.Admin;
import com.opensymphony.xwork2.ActionContext;

public class AdminAction {
	String adminName;
	String adminPwd;
	
	//µÇÂ½ÑéÖ¤
	public String LoginAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		if(adminName.equals("")||adminPwd.equals("")){
			map.put("msg", "ÕËºÅÃÜÂë²»µÃÎª¿Õ");
			return "error";
		}
		
		AdminDao dao = new AdminDao();
		
		if(dao.LoginAdmin(adminName, adminPwd)){
			map.put("aName", adminName);
			return "ok";
		}
		else{
			map.put("msg", "ÕËºÅÃÜÂë´íÎó»òÎ´×¢²á");
			return "error";
		}
	}
	//×¢²á
	public String RegisterAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		if(adminName.equals("")||adminPwd.equals("")){
			map.put("msg", "ÕËºÅÃÜÂë²»µÃÎª¿Õ");
			return "error";
		}
		
		AdminDao dao = new AdminDao();
		Admin admin = new Admin(adminName,adminPwd,"ÒµÎñÔ±");
		
		if(dao.QueryAdminName(adminName)){
			map.put("msg", "ÕËºÅÃÜÂëÒÑ´æÔÚ");
			return "error";
		}else{
			dao.InserAdmin(admin);
			return "ok";
		}
		
			
		
		
	}
	
	
	
	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

}
