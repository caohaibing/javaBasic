package com.testclass;

public class GetLineNumber {
	public static void main(String[] args) {
		System.err.println(new Throwable().getStackTrace()[0].getLineNumber());
	}
}
