package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void runTasks(Class<? extends Runnable> cals) throws Exception {
		ExecutorService es = Executors.newCachedThreadPool();
		System.out.println("开始执行" + cals.getSimpleName() + "任务****") ;
		for (int i = 0; i < 3; i++) {
			es.submit(cals.newInstance());
		}
		TimeUnit.SECONDS.sleep(10);
		System.out.println("执行完毕" + cals.getSimpleName() + "任务****") ;
		es.shutdown();
	}
	public static void main(String[] args) throws Exception {
		runTasks(TaskWithLock.class);
		runTasks(TaskWithSync.class);
	}
}
