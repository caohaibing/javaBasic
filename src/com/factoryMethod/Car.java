package com.factoryMethod;

interface Car {

}

class BlueCar implements Car{
	
}

class YellowCar implements Car{
	
}

class CarFactory{
	public static Car createCar(Class<? extends Car> c){
		try {
			return (Car)c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

