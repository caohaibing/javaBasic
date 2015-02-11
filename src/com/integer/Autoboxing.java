package com.integer;

public class Autoboxing {
	public static void main(String[] args) {
		
		Integer num = 100;
		Integer num2 = 100;
		Integer num3 = 299;
		Integer num4 = 299;
		System.out.println("num == num2" + (num == num2));
		System.out.println("num3 == num4" + (num3 == num4));
		System.out.println("num3 equals num4" + (num3.equals(num4)));
		
		Integer num5 = new Integer(52);
		Integer num6 = new Integer(52);
		System.out.println("num5 == num6" + (num5 == num6));
		System.out.println("num5 equals num6" + (num5.equals(num6)));
	}
	
}
