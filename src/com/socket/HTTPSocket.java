package com.socket;

import java.io.*;
import java.net.*;

public class HTTPSocket
{
    public static void main(String[ ] args) throws UnknownHostException, IOException
    {
        String host = "www.baidu.com";
        int port = 80;
        Socket socket = new Socket(host, port);
        
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        StringBuffer sb = new StringBuffer();
        //请求的连接地址
        sb.append("POST /ServletBindUrl HTTP/1.1\r\n")
           .append("Host:"+ host + "\r\n")
           .append("Content-Type:application/x-www-form-urlencoded\r\n")
           .append("Content-Length:11\r\n")            //11 这个数值是看底下内容的长度的 即多少个字符
           .append("\r\n")
           .append("id=01234567\r\n");                  //内容
        
        out.write(sb.toString());
        out.flush();
        
        //打印响应
        String line = "";
        while((line = in.readLine()) != null)
            System.out.println(line);
    }
}