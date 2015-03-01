package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class TestUerDir {
	public static void main(String[] args) throws IOException {
		File f = new File("test.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream("test.txt", true);
		System.setOut(new PrintStream(fos));
		System.out.println(System.getProperty("user.dir"));
	}
}
