package com.string;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse2("12345"));
	}

	public static String reverse(String originStr) {
		if (originStr == null || originStr.length() <= 1) {
			return originStr;

		} else {
			return reverse(originStr.substring(1)) + originStr.charAt(0);
		}
	}

	public static int reverse2(String str) {
		if (str == null || str.length() <= 1) {
			return Integer.parseInt(str);
		}
		return reverse2(str.substring(1)) + Integer.parseInt(str.charAt(0)+"");
	}
}
