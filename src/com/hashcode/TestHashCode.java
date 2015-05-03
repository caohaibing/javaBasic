package com.hashcode;

public class TestHashCode {
	public static void main(String[] args) {
		Person person1 = new Person("ss");
		Person person2 = new Person("ss");
		System.err.println(person1.equals(person2));
		String s1 = "ad";
		String s2 = "ad";
		System.err.println(s1==s2);
	}
}
