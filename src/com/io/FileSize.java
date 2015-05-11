package com.io;

import java.io.File;

public class FileSize {
	public static void main(String[] args) {
		File file = new File("d:/redis_win.zip");
		System.err.println(file.length()/1000.0);
	}
}
