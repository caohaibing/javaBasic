package com.thread.pool;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class TestThreadPool {
	public static void main(String[] args) {
		// 获取键盘输入
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		String s;
		ThreadPoolManager manager = new ThreadPoolManager(10);
		while (true) {
			s = scanner.next();
			System.out.println(s);
			if (s != null) {
				manager.process(s);
			}
		}
		// 创建10个线程
		// while((s = br.readLine()) != null) {

	}
}
