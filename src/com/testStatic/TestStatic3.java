package com.testStatic;

public class TestStatic3 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static String  test() {
		return name;
	}
}
