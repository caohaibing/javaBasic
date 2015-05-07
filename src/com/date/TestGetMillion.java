package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestGetMillion {
	public static void main(String[] args) throws ParseException {
		long ss = new Date().getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.err.println(dateFormat.parse("2015-04-30 22:15:30").getTime()/1000);
	}
}
