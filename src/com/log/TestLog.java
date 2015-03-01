package com.log;

import java.util.logging.Logger;

public class TestLog {
	public static void main(String[] args) {
		int i = 0;
		System.out.println(i);
		Logger.getGlobal().info("" + i);
	}
}
