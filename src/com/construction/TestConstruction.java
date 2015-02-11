package com.construction;

public class TestConstruction {
	public static void main(String[] args) {
		Sun s = new Sun();
		s.doSomething();
	}
}

class Father{
	Father() {
		new Other();
		System.out.println("father");
	}
}

class Sun extends Father {
	public void doSomething() {
		System.out.println("sun do something");
	}
}

class Other{
	public Other() {
		new Sun();
	}
}
