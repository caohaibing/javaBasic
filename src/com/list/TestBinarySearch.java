package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestBinarySearch {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		cities.add("上海");
		cities.add("广州");
		cities.add("广州");
		cities.add("无锡");
		cities.add("深圳");
		cities.add("北京");
		int index1 = cities.indexOf("广州");
		int index2 = Collections.binarySearch(cities, "广州");
		System.out.println(index1 + "**" + index2);
	}
}
