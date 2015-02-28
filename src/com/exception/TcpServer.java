package com.exception;

public class TcpServer implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("系统正常运行" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		throw new RuntimeException();
	}
	
	public TcpServer() {
		Thread t = new Thread(this);
		t.setUncaughtExceptionHandler(new TcpServerExceptionHandler());
		t.start();
	}
	
}
