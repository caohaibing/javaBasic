package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class TestUrl {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.baidu.com");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		if((line=reader.readLine())!= null) {
			System.out.println(line);
		}
	}
}
