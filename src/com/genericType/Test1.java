package com.genericType;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println(list1.getClass());
		System.out.println(list1.getClass() == list2.getClass());
		System.out.println(1 << 3);
		System.out.println(1 << 35);                              
		System.out.println((byte)300);
		System.out.println("java\u2122");
 	}
}
