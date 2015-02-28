package com.thread.pool;

public class SimpleThread extends Thread {
	private boolean runningFlag;
	private String argument;

	public boolean isRunning() {// 判断线程是否空闲
		return runningFlag;
	}

	public synchronized void setRunning(boolean flag) { // 该同步方法让空闲线程处理任务
		runningFlag = flag;
		if (flag) {
			this.notify();
		}
	}

	public SimpleThread(int threadNumber) {// 初始化线程
		runningFlag = false;// 线程空闲
		System.out.println("线程" + threadNumber + "启动了.....");
	}

	@Override
	public synchronized void run() {
		try {
			while (true) {
				if (!runningFlag) {
					this.wait();
				} else {
					System.out.println(this.getArgument() + "处理完毕。");
					sleep(5000);
					System.out.println("线程睡眠。·");
					this.wait();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("程序异常终止。");
		}
	}

	public boolean isRunningFlag() {
		return runningFlag;
	}

	public void setRunningFlag(boolean runningFlag) {
		this.runningFlag = runningFlag;
	}

	public String getArgument() {
		return argument;
	}

	public void setArgument(String argument) {
		this.argument = argument;
	}

}
