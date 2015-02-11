package com.inteceptor;

import java.util.ArrayList;
import java.util.List;

public class ActionInvocation {
	List<Interceptor> interceptors = new ArrayList<Interceptor>();
	public ActionInvocation() {
		interceptors.add(new FirstInterceptor());
		interceptors.add(new SecondInterceptor());
	}
	int index = -1;
	public void invoke() {
		index++;
		if(index >= this.interceptors.size()) {
			new Action().execute();
		} else {
			this.interceptors.get(index).intercept(this);
		}
	}
}
