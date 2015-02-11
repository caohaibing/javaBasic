package com.string;

public class TestStringPool {
	public static void main(String[] args) {
		String s1 = "ss";
		String s2 = "ss";
		String s3 = new String("ss");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s3.intern());
		System.out.println(s1.substring(0));
	}
}
