package com.bv.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class SecondInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation ai2) throws Exception {
		System.out.println("Pre Processing of Second Interceptor");
		String result = ai2.invoke();
		System.out.println("Post Processing of Second Interceptor");
		return result;
	}

}
