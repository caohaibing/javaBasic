package com.testAssert;

import java.util.Arrays;
import java.util.logging.Logger;

public class TestAssert {
	public static void main(String[] args) {
		int[] a = {1,2453,23,23,4,25,324,24,2,43};
		//int[] a = {};
		assert a.length != 0;
		Arrays.sort(a);
		Logger.getGlobal().info("a" + a.length);
		System.out.println(a.length);
	}
}
