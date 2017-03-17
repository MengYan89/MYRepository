package com.nsu.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyValidateInterceptor implements Interceptor {

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
		// 1.得到session action
		// 2.如果登陆成功，session中可以取出user信息
		// 3.如果信息表上你已经登陆成功了，进入默认流程 调用action
		Map session=(Map)action.getInvocationContext().get("session");
		String name=(String) session.get("uname");
		if(name!=null){
		return action.invoke();//result
		}
		else{
				session.put("msg", "no login....");
		return "failure";
		}
	}

}
