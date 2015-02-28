package com.thread.pool;

import java.util.Vector;

public class ThreadPoolManager {
	private int maxThread;
	public Vector<Thread> vector;
	
	//线程初始化
	public ThreadPoolManager(int threadCount) {
		setMaxThread(threadCount);
		System.out.println("正在启动线程池");
		vector = new Vector<Thread>();
		for (int i = 0; i < threadCount; i++) {
			SimpleThread thread = new SimpleThread(i);//创建线程并启动
			vector.addElement(thread);//存放到数组中
			thread.start();
		}
	}
	
	//任务处理
	public void process(String argument) {
		int i;
		for(i = 0; i < vector.size(); i++) {
			SimpleThread currentThread = (SimpleThread) vector.elementAt(i);
			if(!currentThread.isRunning()) {//有空闲线程
				System.out.println("线程" + (i + 1) + "正在处理。。。");
				currentThread.setArgument(argument);
				currentThread.setRunning(true);
				return;
			}
			if(i == vector.size()) {
				System.out.println("线程池已满。。。。");
			}
		}
	}
	
	public int getMaxThread() {
		return maxThread;
	}
	public void setMaxThread(int maxThread) {
		this.maxThread = maxThread;
	}
	
}
