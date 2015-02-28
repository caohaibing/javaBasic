package com.thread;

import java.util.Calendar;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task {
	public void doSomething() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		StringBuffer sb = new StringBuffer();
		sb.append("线程名称" + Thread.currentThread().getName());
		sb.append("执行时间" + Calendar.getInstance().get(13));
		System.out.println(sb);
	}
}

class TaskWithLock extends Task implements Runnable{

	private final Lock lock = new ReentrantLock();
	@Override
	public void run() {
		try {
			
			lock.lock();
			doSomething();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
}

class TaskWithSync extends Task implements Runnable {

	@Override
	public void run() {
		synchronized ("A") {
			doSomething();
		}
	}
	
}
