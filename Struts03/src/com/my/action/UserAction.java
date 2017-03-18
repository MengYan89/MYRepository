package com.my.action;

import java.util.List;
import java.util.Map;

import com.my.dao.UserDao;
import com.my.entity.Users;
import com.opensymphony.xwork2.ActionContext;

public class UserAction {
	
	
	public String QueryUsersAction(){
		UserDao dao = new UserDao();
		List<Users> Ulist=dao.QueryUsers();
		Map map = (Map)ActionContext.getContext().get("session");
		if(Ulist.size()==0||Ulist==null){
			map.put("msg", "ÔÝÎÞ×ÊÁÏ");
			return "error";
		}
		else{
			map.put("Ulist", Ulist);
		}
		return "ok";
	}

}
