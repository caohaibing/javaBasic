package com.integer;

public class TestInteger {
	public static void main(String[] args) {
		TestInteger testInteger = new TestInteger();
		int i = 147;
		testInteger.f(i);
		testInteger.f(new Integer(i));
		testInteger.f(Integer.valueOf(i));
	}
	
	public void f(long a) {
		System.out.println("基本类型");
	}
	public void f(Long a) {
		System.out.println("包装类型");
	}
}
