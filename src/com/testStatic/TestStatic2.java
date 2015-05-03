package com.testStatic;

public class TestStatic2 {
	private static int staticVar=0;
	private int instanceVar=0; 
	public TestStatic2() {
		staticVar++;
		instanceVar++;
		System.err.println("staticVar" + staticVar);
		System.err.println("instanceVar" + instanceVar);
	}
	
	public static void main(String[] args) {
		TestStatic2 t2_1 = new TestStatic2();
		TestStatic2 t2_2 = new TestStatic2();
		TestStatic2 t2_3 = new TestStatic2();
		
	}
}
