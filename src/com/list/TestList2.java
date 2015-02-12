package com.list;

import java.util.ArrayList;
import java.util.List;

public class TestList2 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		List<String> list2 = new ArrayList<String>();
		list2.add("c");
		list2.add("b");
		//list1.addAll(list2);
		list1.retainAll(list2);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
}
