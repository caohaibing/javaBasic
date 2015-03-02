package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;

public class TestFile {
	public static void main(String[] args){
		File file = new File("d:/");
		File file2 = new File("D:\\java\\eclipse_workspace\\JavaBasicTest\\test.txt");
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getParent());
		System.out.println(file2.list());
		System.out.println(file2.setReadOnly());
		System.out.println(file2.getParentFile());
		try {
			System.out.println(file2.toURL());
		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			System.out.println(file2.getCanonicalPath());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(!file2.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			System.setOut(new PrintStream(file2));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//TestFile.print(file);
	}

	/*
	 * public static void getAllFile(File file) { if(!file.isFile()) { File[]
	 * file_2 = file.listFiles(); for (File file2 : file_2) {
	 * TestFile.getAllFile(file2); } } else { System.out.println(file); } }
	 */
	public static void print(File f) {
		if (f != null) {
			if (f.isDirectory()) {
				File[] fileArray = f.listFiles();
				if (fileArray != null) {
					for (int i = 0; i < fileArray.length; i++) {
						// 递归调用
						print(fileArray[i]);
					}
				}
			} else {
				System.out.println(f);
			}
		}
	}
}
