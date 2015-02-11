package com.construction;

public class TestCodeBlock {
	{
		System.out.println("构造代码块");
	}
	
	public TestCodeBlock() {
		System.out.println("无参构造函数");
	}
	
	public TestCodeBlock(String str) {
		System.out.println("有参构造函数");
	}
	
	public static void main(String[] args) {
		TestCodeBlock s = new TestCodeBlock("ss");
	}
}
