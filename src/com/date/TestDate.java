package com.date;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date date = new Date();
		String dateTime = (String.format("%tF", date)).substring(0, 7);
	}
}	
