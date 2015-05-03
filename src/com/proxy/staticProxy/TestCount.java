package com.proxy.staticProxy;

public class TestCount {
	public static void main(String[] args) throws Exception{
		CountImpl countImpl = new CountImpl();
		CountProxy countProxy = new CountProxy(countImpl);
		countProxy.queryCount();
		countProxy.updateCount();
		throw new RuntimeException("ss");
	}
}
