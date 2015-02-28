package com.thread;

public class TestLock2 {
	public static void main(String[] args) {
		TestLock3 t3 = new TestLock3();
		Thread t = new Thread(t3);
		t.start();
	}
}
