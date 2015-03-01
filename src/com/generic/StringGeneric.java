package com.generic;

public class StringGeneric {
	public static void main(String[] args) {
	/*	TestGeneric<String> generic = new TestGeneric<String>();
		generic.setFirst("ss");
		System.out.println(generic.getFirst());*/
		String[] a = {"a","sda", "dadas", "ds"};
		TestGeneric<String> test = ArrayLog.minMax(a);
		System.out.println(test.getFirst());
		System.out.println(test.getSecond());
				
	}
}

class ArrayLog {
	public static TestGeneric<String> minMax(String[] a) {
		if(a == null || a.length == 0) {
			return null;
		}
		String min = a[0];
		String max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(min.compareTo(a[i]) > 0){
				min = a[i];
			}
			if(max.compareTo(a[i]) < 0) {
				max = a[i];
			}
			
		}
		return new TestGeneric<String>(min, max);
	}
}
