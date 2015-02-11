package com.inteceptor;

public class FirstInterceptor implements Interceptor{

	@Override
	public void intercept(ActionInvocation actionInvocation) {
		System.out.println(1);
		actionInvocation.invoke();
		System.out.println(-1);
	}
	
	

}
