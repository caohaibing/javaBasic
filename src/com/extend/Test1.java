package com.extend;

public class Test1 {
	public static void main(String[] args) {
		Parent parent = new Sun();
		parent.base(1, 42);
		Sun sun = new Sun();
		sun.base(1, 45);
	}
}

class Parent {
	void base(int price, int...discount) {
		System.out.println("parent ........ fun");
	}
}
class Sun extends Parent{
	@Override
	void base(int price, int[] discount) {
		// TODO Auto-generated method stub
		System.out.println("sun --------- fun");
	}

	public void base(int price, int i) {
		// TODO Auto-generated method stub
		
	}
}
