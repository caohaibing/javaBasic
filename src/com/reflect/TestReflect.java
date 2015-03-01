package com.reflect;

import java.lang.reflect.Method;

public class TestReflect {
	public static void main(String[] args) {
/*		Person p = new Person("ss", 12);
		System.out.println(p.getClass().getName());
		Method[] m = p.getClass().getMethods();
		System.out.println(m[1].getName());
		System.out.println(m[1].getModifiers());*/
		try {
			Class c1 = Class.forName("java.lang.Double");
			print(c1.getMethods());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void print(Method[] methods) {
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
	}
}
