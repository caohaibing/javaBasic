package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class StudyIO {
	public static void main(String[] args) {
		/**
		 * 创建文件
		 */
		/*File f = new File("d:" + File.separator + "hello.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		/**
		 * 分隔符
		 */
		
		/*System.err.println(File.separator);
		System.err.println(File.pathSeparator);*/
		
		/**
		 * 删除一个文件
		 */
	/*	File f = new File("d:" + File.separator + "hello.txt");
		if(f.exists()) {
			f.delete();
		} else {
			System.err.println("文件不存在");
		}*/
		
		/**
		 * 创建文件夹
		 */
		
		/*File f = new File("d:" + File.separator + "hello");
		f.mkdir();*/
		
		/**
		 * 使用list列出目录的所有文件
		 */
	/*	File f = new File("d:" + File.separator);
		File[] str = f.listFiles();
		for (int i = 0; i < str.length; i++) {
			if(f.isDirectory()) {
				System.err.println("目录" + str[i]);
			} else {
				System.err.println(str[i]);
			}
		}*/
		
		/**
		 * 指定目录的全部内容
		 */
		
		/*File f = new File("d:" + File.separator + "apache-maven-3.2.5");
		print(f);*/
		
		/**
		 * 写字符串
		 */
	/*	File f = new File("d:" + File.separator + "hello.txt");
		try {
			OutputStream out = new FileOutputStream(f,true);
			String str = "你好";
			byte[] b = str.getBytes();
			out.write(b);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/**
		 * 读文件
		 */
		
		File f = new File("d:" + File.separator + "hello.txt");
		try {
			InputStream in = new FileInputStream(f);
			byte[] b = new byte[1024];
			int count = 0;
			int temp=0;
			while((temp=in.read())!= -1) {
				b[count++] = (byte) temp;
				//System.err.println((byte) temp);
			}
			in.close();
			System.err.println(new String(b));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String ss= "﻿你好 Hello";
		byte[] bb = ss.getBytes();
		for (int j = 0; j < bb.length; j++) {
			//System.err.println(bb[j]);
		}
		byte[] bbb = {-27,-91,-67,32};
		for (int i = 0; i < bbb.length; i++) {
			System.err.println(bbb[i]&0xff);
		}
		System.err.println(new String(bbb));
		String encoding = System.getProperty("file.encoding"); 
		System.out.println(encoding); 
		
		/**
		 * 读取文件内容
		 */
/*		char[] ch = new char[100];
		try {
			Reader read = new FileReader(f);
			int count = read.read(ch);
			read.close();
			System.err.println(count);
			System.err.println(new String(ch,0,count));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		/**
		 * 文件压缩
		 */
		File zipFile = new File("d:" + File.separator + "hello.zip");
		try {
			InputStream input = new FileInputStream(f);
			ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
			zipOut.putNextEntry(new ZipEntry(f.getName()));
			int temp = 0;
			 // 设置注释
	        //zipOut.setComment("hello");
			while((temp = input.read()) != -1) {
				zipOut.write(temp);
			}
			input.close();
			zipOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

/*	private static void print(File f) {
		if(f.isDirectory()) {
			File[] fileList = f.listFiles();
			if(fileList != null) {
				for (int i = 0; i < fileList.length; i++) {
					print(fileList[i]);
				}
			}
		} else {
			System.err.println(f);
		}
	}*/
}
