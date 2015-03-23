package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestTomcat {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("127.0.0.1",8080);
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		pw.write("GET / HTTP/1.1");
		pw.write("Host: www.youku.com");
		pw.write("Context-Type: text/html");
		pw.println();
		pw.flush();
		BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = "";
		while((str = r.readLine()) != null) {
			System.out.println(str);
		}
		r.close();
		pw.close();
		s.close();
	}
}
