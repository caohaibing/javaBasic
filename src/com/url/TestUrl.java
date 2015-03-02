package com.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestUrl {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.baidu.com");
		InputStream in = url.openStream();
		Scanner scanner = new Scanner(in);
		StringBuffer sf = new StringBuffer();
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
	}
}
