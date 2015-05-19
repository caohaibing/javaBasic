package com.request;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.util.Des3;

public class TestRequest2 {
	public static void main(String[] args) throws Exception {
		System.err.println(httpRequest("http://localhost:8080/rayweb/time/getDriverTime/","userId="+Des3.encode("584365635")));

	}

	public  static String httpRequest(String requestUrl, String para) {
		InputStream inputStream = null;
		StringBuffer bf = new StringBuffer();
		try {
			URL url = new URL(requestUrl);
			System.err.println(requestUrl+para);
			HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();
			httpUrlConn.setRequestProperty("Referer", "com.raymi.mifm");
			httpUrlConn.setRequestProperty("version", "0.99");
			httpUrlConn.setDoInput(true);
			httpUrlConn.setDoOutput(true);
			httpUrlConn.setRequestMethod("POST");
			httpUrlConn.getOutputStream().write(para.getBytes());
			httpUrlConn.connect();
			
			// 获得返回的输入流
			inputStream = httpUrlConn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			String readLine = "";
			while ((readLine = br.readLine()) != null) {
				bf.append(readLine);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bf.toString();
	}

	

}
