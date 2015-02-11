package com.construction;

public class TestCodeBlock2 {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test(5);
		Test t3 = new Test("ss");
		System.out.println(Test.getNum());
	}
}

class Test {
	public static int num = 0;
	
	
	{
		num++;
	}
	public Test() {
		System.out.println(num + "*");
	}
	
	public Test(String str){
		this();
		System.out.println(num + "**");
	}
	
	public Test(int i) {
		System.out.println(num + "***");
	}
	
	public static int getNum() {
		return num;
	}
}
