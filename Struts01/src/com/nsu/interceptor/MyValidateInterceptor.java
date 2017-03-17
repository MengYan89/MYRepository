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
		// 1.�õ�session action
		// 2.�����½�ɹ���session�п���ȡ��user��Ϣ
		// 3.�����Ϣ�������Ѿ���½�ɹ��ˣ�����Ĭ������ ����action
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
