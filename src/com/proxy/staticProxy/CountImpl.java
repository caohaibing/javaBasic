package com.proxy.staticProxy;

public class CountImpl implements Count{

	@Override
	public void queryCount() {
		System.out.println("queryCount");
	}

	@Override
	public void updateCount() {
		System.out.println("updateCount");
	}
	
}
