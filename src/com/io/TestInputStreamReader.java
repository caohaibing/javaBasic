package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestInputStreamReader {
	public static void main(String[] args) throws IOException {/*
		InputStreamReader isr = new InputStreamReader(System.in,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		String brLine = null;
		while((brLine=br.readLine())!=null) {
			if(brLine.equals("exit")) {
				System.exit(1);
			} else {
				System.err.println(new String(brLine.getBytes("utf-8"),"utf-8"));
				
			}
		}
	*/
		/*PrintStream ps = new PrintStream(System.out);
		ps.append('a');
		ps.println();*/
		
		PrintWriter pw = new PrintWriter("d:/hello.txt");
		pw.write("唐庆");
		pw.close();
	}
	
}
