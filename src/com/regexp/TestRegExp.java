package com.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegExp {
	public static void main(String[] args) {/*
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			Pattern pattern =  Pattern.compile("\\b\\w+\\b");
			int count = 0;
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				count ++;
			}
			
			System.out.println(str + "  单词数" + count);
		}
	*/
		String url = "http://localhsot:8080/api/list?user=ss";
		Pattern pp = Pattern.compile("\\b");
	}
}
