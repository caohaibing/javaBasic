package com.exception;

import java.util.Scanner;

public class StackTrace {
	public static int f(int i) {
		Throwable t = new Throwable();
		StackTraceElement[] s = t.getStackTrace();
		for (StackTraceElement stackTraceElement : s) {
			System.out.println(stackTraceElement);
		}
		return i;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		f(i);
	}
}
