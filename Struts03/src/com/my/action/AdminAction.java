package com.my.action;

import java.util.Map;

import com.my.dao.AdminDao;
import com.my.entity.Admin;
import com.opensymphony.xwork2.ActionContext;

public class AdminAction {
	String adminName;
	String adminPwd;
	
	//��½��֤
	public String LoginAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		if(adminName.equals("")||adminPwd.equals("")){
			map.put("msg", "�˺����벻��Ϊ��");
			return "error";
		}
		
		AdminDao dao = new AdminDao();
		
		if(dao.LoginAdmin(adminName, adminPwd)){
			map.put("aName", adminName);
			return "ok";
		}
		else{
			map.put("msg", "�˺���������δע��");
			return "error";
		}
	}
	//ע��
	public String RegisterAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		if(adminName.equals("")||adminPwd.equals("")){
			map.put("msg", "�˺����벻��Ϊ��");
			return "error";
		}
		
		AdminDao dao = new AdminDao();
		Admin admin = new Admin(adminName,adminPwd,"ҵ��Ա");
		
		if(dao.QueryAdminName(adminName)){
			map.put("msg", "�˺������Ѵ���");
			map.remove("admin");
			return "error";
		}else{
			dao.InserAdmin(admin);
			map.remove("admin");
			return "ok";
		}
		
	}
	//ע��
	public String LogoutAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		map.remove("aName");
		return "ok";
	}
	//�һ�����
	public String RetrievePasswordAction(){
		Map map = (Map)ActionContext.getContext().get("session");
		map.put("msg", "���ܿ�����");
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
