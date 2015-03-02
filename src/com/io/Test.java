package com.io;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args) throws UnknownHostException, IOException {
		File f = new File("asdasdslfdjsdfdkgdlgdadsad");
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.exists());
		Socket s = new Socket("ss", 20);
	}
}
