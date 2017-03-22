package com.my.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation action) throws Exception {
		// TODO Auto-generated method stub
		Map session = (Map)action.getInvocationContext().get("session");
		String name = (String)session.get("aName");
		if(name!=null)
			return action.invoke();
		else{
			session.put("msg", "ÇëµÇÂ¼");
			return "error";
		}
	}
	

}
