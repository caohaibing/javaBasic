package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//public class DynamicProxy implements Subject{
//
//	
//	private Subject subjec = null;
//	public DynamicProxy() {
//		this.subjec = new RealSubject();
//	}
//	
//	public DynamicProxy(Subject _subject) {
//		this.subjec = _subject;
//	}
//	
//	
//	@Override
//	public void request() {
//		before();
//		subjec.request();
//		after();
//	}
//
//	private void after() {
//		System.out.println("after");
//	}
//
//	private void before() {
//		System.out.println("before");
//	}
//	
//}

public class DynamicProxy implements InvocationHandler{

	public Subject subject;
	
	public DynamicProxy(Subject _subject) {
		this.subject = _subject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("预处理");
		Object obj = method.invoke(proxy, args);
		System.out.println("后处理");
		return obj;
	}
	
}
