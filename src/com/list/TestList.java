package com.list;

import java.util.Arrays;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		List list = Arrays.asList(a);
		System.out.println(list.size());
		System.out.println(list.get(0).getClass());
		System.out.println(a.equals(list.get(0)));
	}
}
