package com.string;

public class TestStringPool {
	public static void main(String[] args) {
		/*String s1 = "ss";
		String s2 = "ss";
		String s3 = new String("ss");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s3.intern());
		System.out.println(s1.substring(0));*/
		
		String s1 = "a";
		String s2 = s1 + "b";
		String s3 = "a" + "b";
		System.out.println(s3 == "ab");
		System.out.println(s2 == "ab");
	}
}
