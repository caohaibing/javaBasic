package com.factoryMethod;

public class TestFactory {
	public static void main(String[] args) {
		Car c = CarFactory.createCar(YellowCar.class);
		System.out.println(c.getClass().getName());
	}
}
