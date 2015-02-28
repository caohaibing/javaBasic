package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestLock {
	private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	private final Lock r = rwl.readLock();
	private final Lock w = rwl.writeLock();
	
	public void read() {
		try {
			r.lock();
			Thread.sleep(1000);
			System.out.println("read.........");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			r.unlock();
		}
		
	}
	
	public void write() {
		try {
			w.lock();
			Thread.sleep(1000);
			System.out.println("write.........");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			w.unlock();
		}
	}
}

class TestLock3 extends TestLock implements Runnable{

	@Override
	public void run() {
		
	}
	
}
