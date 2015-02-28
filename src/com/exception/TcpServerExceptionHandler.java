package com.exception;

import java.lang.Thread.UncaughtExceptionHandler;

public class TcpServerExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("线程" + t.getName() + "中断，已重启线程，请分析原因");
		e.printStackTrace();
		new TcpServer();
	}

}
