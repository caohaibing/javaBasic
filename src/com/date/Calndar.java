package com.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calndar {
	public static void main(String[] args) {
		/*
		 * Calendar cal = Calendar.getInstance(); //取得系统当前时间所在月第一天时间对象
		 * cal.set(Calendar.DAY_OF_MONTH, 1); //日期减一,取得上月最后一天时间对象
		 * cal.add(Calendar.DAY_OF_MONTH, -1); //输出上月最后一天日期
		 * System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		 */
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, -1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
		String time = format.format(c.getTime());

	}
}
