package com.recursion;

public class Rcursion {
	public static void main(String[] args) {
		new Rcursion().test("ss");
	}

	private void test(String string) {
		System.out.println(string);
		test("aa");
	}
}
