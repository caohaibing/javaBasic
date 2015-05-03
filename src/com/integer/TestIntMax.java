package com.integer;

import java.math.BigInteger;

public class TestIntMax {
	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		int sum = a + b;
		System.err.println(sum);
		System.err.println(Integer.toBinaryString(a));
		System.err.println(b + 1);
		System.err.println(Integer.valueOf("011111111111111111111111111111111", 2));
	}
}
