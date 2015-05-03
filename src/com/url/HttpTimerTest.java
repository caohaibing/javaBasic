package com.url;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
 
public class HttpTimerTest {
 
    public static void sendHttp(String host,String content){/*
        System.out.println("sendHttp");
        try {
            URL url = new URL(urlStr);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(); 
            httpURLConnection.setRequestMethod("GET"); 
            httpURLConnection.setDoOutput(true);
 
            int size = httpURLConnection.getContentLength();
            System.out.println("size=" + size);
            byte[] buffer = new byte[1024]; 
            byte[] in_b = new byte[1024]; 
            int count = 0;
            int rbyte = 0;
            InputStream is = httpURLConnection.getInputStream();
            while (count < 1024) { // 循环读取
                rbyte = is.read(buffer); 
                for (int i = 0; i < rbyte; i++) {
                    in_b[count + i] = buffer[i];
                }
                count += rbyte;
            }
            String content = new String(buffer, "UTF-8");
            System.out.println(content);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    */
    	BufferedWriter out = null;
    	BufferedReader in = null;
    	try {
		

        int port = 80;
        Socket socket = new Socket(host, port);
        
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        StringBuffer sb = new StringBuffer();
        //请求的连接地址
        sb.append("POST "+ content +" HTTP/1.1\r\n")
           .append("Host:"+ host + "\r\n")
           .append("Content-Type:application/x-www-form-urlencoded\r\n")
           .append("Content-Length:11\r\n")            //11 这个数值是看底下内容的长度的 即多少个字符
           .append("\r\n")
           .append("id=01234567\r\n");                  //内容
        
        out.write(sb.toString());
        out.flush();
        
        //打印响应
        String line = "";
        while((line = in.readLine()) != null){
        	System.out.println(line);
        }
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if(out != null) {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			out = null;
		}
		if(in != null) {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			in = null;
		}
		
	}
    }
 
    public static void main(String args[]) {
        Timer timer = new Timer();
        boolean i = true;
        timer.schedule(new URLTask(), 1000, 5000);
        while (i) {
            System.out.println(i);
            try {
                int ch = System.in.read();
                if (ch - 'c' == 0) {
                    i = false;
                    timer.cancel();//使用这个方法退出任务
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 
    static class URLTask extends TimerTask {
 
        public void run() {
            long start = System.currentTimeMillis();
            try {
				sendHttp("www.baidu.com","/home?dsp=netbar&tn=01025065_7_pg");
			} catch (Exception e) {
				e.printStackTrace();
			}
            //System.out.println("________");
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println(time / 1000 + "秒" + time % 1000 + "毫秒");
        }
    }
}