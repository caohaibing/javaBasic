package com.request;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.util.Des3;

public class TestRequest {

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

	public static void main(String[] args) throws Exception {
		/*System.err.println(httpRequest(UserTimeApi.DETAIL_AND_TOTAL_URL,"234234"));
		System.err.println(httpRequest(UserTimeApi.DETAIL_URL,"234234"));*/
		
		//System.err.println(httpRequest(UserTimeApi.TOTAL_DAY_URL,"234234"));
		//http://XXX:8080/rayweb/time/addDriverTime/{userId:"234234",startTime:"2015-04-30 19:20:30",endTime:"2015-04-30 22:15:30"}
		/*Timer time = new Timer();
		
		time.schedule(new TimerTask() {
			
			@Override
			public void run() {
				String result="";
				try {
					//result = httpRequest("http://localhost:8080/rayweb/time/addDriverTime/","userId="+ Des3.encode(MyJsonUtil.randomUser())+"&"+MyJsonUtil.randomTime());
					result = httpRequest("http://localhost:8080/rayweb/time/addDriverTime/","userId="+ MyJsonUtil.randomUser()+"&"+MyJsonUtil.randomTime());
				} catch (Exception e) {
					e.printStackTrace();
				}
				JSONObject json=null;
				try {
					json = JSONObject.fromObject(Des3.decode(result));
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(json.getInt("success") !=200) {
					System.err.println(new Date());
					cancel();
				}
			}
		}, 0, 1);
*/
		System.err.println(httpRequest("http://114.215.158.134:9700/rayweb/time/getDriverTime/","userId="+Des3.encode("584365635")));
		//System.err.println(httpRequest("http://192.168.0.190:8080/rayweb/time/flushDB",""));
		//System.err.println(httpRequest("http://192.168.0.190:8080/rayweb/time/Test/","234234"));
		//System.err.println(httpRequest("http://192.168.0.190:8080/rayweb/time/getDriverTime","234234"));

		//System.err.println(httpRequest("http://www.baidu.com", ""));
		
		//System.err.println(httpRequest("http://localhost:8080/rayweb/time/getDriverTime/", "234234"));
	}

}
