package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8189);
		Socket s = server.accept();
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		Scanner inScanner = new Scanner(in);
		PrintWriter write = new PrintWriter(out, true);
		write.println("Hello! bye to exit");
		boolean done = false;
		while (!done && inScanner.hasNext()) {
			String line = inScanner.nextLine();
			System.out.println("message:" + line);
			if(line.equalsIgnoreCase("bye")) {
				done = true;
			}
		}
	}
}
