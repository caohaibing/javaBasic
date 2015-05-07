package com.reference;

public class TestReference {
	public static void main(String[] args) {
		Person p = new Person("ss");
		
		change(p);
		System.err.println(p.getName());
	}

	/**
	 * 永远都不会在局部变量区或操作数栈中发现对象的拷贝，只有对象的引用
	 * @param p
	 */
	private static void change(Person p) {
		Person pp = p;
		pp.setName("aa");
	}
}	
