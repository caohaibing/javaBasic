package com.identity;

public class Test1 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <10; i++) {
			//count = count ++;
			count = (++count);
		}
		System.out.println(count);
	}
}
