package com.my.action;

import java.util.Map;

import com.my.dao.AdminDao;
import com.my.entity.Admin;
import com.opensymphony.xwork2.ActionContext;

public class AdminAction {
	String adminName;
	String adminPwd;
	
	//登陆验证
	public String LoginAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		if(adminName.equals("")||adminPwd.equals("")){
			map.put("msg", "账号密码不得为空");
			return "error";
		}
		
		AdminDao dao = new AdminDao();
		
		if(dao.LoginAdmin(adminName, adminPwd)){
			map.put("aName", adminName);
			return "ok";
		}
		else{
			map.put("msg", "账号密码错误或未注册");
			return "error";
		}
	}
	//注册
	public String RegisterAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		if(adminName.equals("")||adminPwd.equals("")){
			map.put("msg", "账号密码不得为空");
			return "error";
		}
		
		AdminDao dao = new AdminDao();
		Admin admin = new Admin(adminName,adminPwd,"业务员");
		
		if(dao.QueryAdminName(adminName)){
			map.put("msg", "账号密码已存在");
			map.remove("admin");
			return "error";
		}else{
			dao.InserAdmin(admin);
			map.remove("admin");
			return "ok";
		}
		
	}
	//注销
	public String LogoutAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		map.remove("aName");
		return "ok";
	}
	//找回密码
	public String RetrievePasswordAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		map.put("msg", "功能开发中");
		return "error";
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
