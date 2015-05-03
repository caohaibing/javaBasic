package com.json;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.management.timer.TimerMBean;

import net.sf.json.JSONArray;


public class JokeService{
	static String requestUrl = "http://api.laifudao.com/open/tupian.json";
	InputStream in = httpRequest(requestUrl);
	static List<Joke> jokes;
	
	public JokeService() {
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				parseJson(httpRequest(requestUrl));
			}
		}, 0,36000);
	}
	
	private static InputStream httpRequest(String c) {
		InputStream inputStream = null;
		try {
			URL url = new URL(requestUrl);
			HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();
			httpUrlConn.setDoInput(true);
			httpUrlConn.setRequestMethod("GET");
			httpUrlConn.connect();
			// 获得返回的输入流
			inputStream = httpUrlConn.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return inputStream;
	}

	
	
	private static void parseJson(InputStream in) {
		StringBuffer bf = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String readLine = "";
		try {
			while ((readLine = br.readLine()) != null) {
				bf.append(readLine);
			}
			System.out.println(bf.toString());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		JSONArray jsonArray = JSONArray.fromObject(bf.toString());
		jokes = (List<Joke>) JSONArray.toCollection(jsonArray,Joke.class);
		System.err.println("test");
	}
	

	
}
