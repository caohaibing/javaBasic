package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		List<String> strs = new ArrayList<String>(10);
		System.out.println(strs.size());
		strs.add("ss");
	}
}
