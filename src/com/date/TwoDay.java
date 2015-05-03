package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TwoDay {
	public static void main(String[] args) throws ParseException {
		String startTime="2015-04-03 23:23:23";
		String endTime="2015-04-28 04:23:23";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date start = sdf.parse(startTime);
		Date end = sdf.parse(endTime);
		System.err.println(startTime.substring(0, 10).equals(endTime.substring(0, 10)));
		System.err.println((end.getTime()-start.getTime())/1000/60 > 24*60);
	/*	if(!startTime.substring(0, 10).equals(endTime.substring(0, 10))) {
			if((end.getTime()-start.getTime())/1000/60 < 24*60) {
				Calendar cal = Calendar.getInstance();
		        cal.setTime(start);
		        cal.set(Calendar.HOUR_OF_DAY, 0);
		        cal.set(Calendar.MINUTE, 0);
		        cal.set(Calendar.SECOND, 0);
		        cal.set(Calendar.MILLISECOND, 0);
		        cal.add(Calendar.DAY_OF_MONTH, 1);
				System.err.println((cal.getTime().getTime()-start.getTime())/1000/60);
				System.err.println(sdf.format(cal.getTime()));
			} else {
				for(int i=0;i<=(end.getTime()-start.getTime())/1000/60/60/24+1;i++) {
					SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
					Calendar cal = Calendar.getInstance();
			        cal.setTime(start);
			        cal.set(Calendar.HOUR_OF_DAY, 0);
			        cal.set(Calendar.MINUTE, 0); 
			        cal.set(Calendar.SECOND, 0);
			        cal.set(Calendar.MILLISECOND, 0);
			        cal.add(Calendar.DAY_OF_MONTH, i);
			        System.err.println(sdf2.format(cal.getTime()));
			        
				}
			}
		}
*/
		for(int i=0;i<=(end.getTime()-start.getTime())/1000/60/60/24+1;i++) {
			//SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd ");
			Calendar cal = Calendar.getInstance();
	        cal.setTime(start);
	        cal.set(Calendar.HOUR_OF_DAY, 0);
	        cal.set(Calendar.MINUTE, 0); 
	        cal.set(Calendar.SECOND, 0);
	        cal.set(Calendar.MILLISECOND, 0);
	        cal.add(Calendar.DAY_OF_MONTH, i);
	        System.err.println(sdf.format(cal.getTime()));
	        
		}
	}
}
