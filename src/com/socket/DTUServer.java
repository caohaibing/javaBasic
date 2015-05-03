package com.socket;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DTUServer {
	private static ServerSocket ss;
	private static Socket socket;
	PrintWriter out;
	public static void main(String[] args) {
		try {
			ss = new ServerSocket(8800);
			while(true){
				System.err.println("start");
				socket = ss.accept();
				ss.setSoTimeout(5000);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
