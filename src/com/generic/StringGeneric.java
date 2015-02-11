package com.generic;

public class StringGeneric {
	public static void main(String[] args) {
		TestGeneric<String> generic = new TestGeneric<String>();
		generic.setFirst("ss");
		System.out.println(generic.getFirst());
	}
}
