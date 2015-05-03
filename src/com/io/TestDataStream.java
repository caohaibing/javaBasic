package com.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
	public static void main(String[] args) throws IOException {
		/*DataInputStream dis = new DataInputStream(new FileInputStream("d:/hello.txt"));
		byte[] bb = new byte[1024];
		int count=dis.read(bb);
		System.err.println(new String(bb,0,count));*/
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("d:/hello.txt"));
		String str = "你好";
		dos.write(str.getBytes());
	}
}
