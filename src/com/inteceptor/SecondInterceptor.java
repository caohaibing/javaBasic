package com.inteceptor;

public class SecondInterceptor implements Interceptor{

	@Override
	public void intercept(ActionInvocation actionInvocation) {
		System.out.println(2);
		actionInvocation.invoke();
		System.out.println(-2);
	}
	
	

}
