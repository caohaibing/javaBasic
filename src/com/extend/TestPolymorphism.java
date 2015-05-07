package com.extend;

public class TestPolymorphism {
	public static void main(String[] args) {
		Super sup = new Sub();
		System.err.println(sup.field);
		System.err.println(sup.getField());
		Sub sub = new Sub();
		System.err.println(sub.field);
		System.err.println(sub.getField());
	}
}


class Super {
	public int field = 0;
	
	public int getField(){
		return field;
	}
}

class Sub extends Super  {
	public int field = 1;
	
	@Override
	public int getField() {
		return super.field;
	}
}