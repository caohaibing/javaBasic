package com.socket;

import java.io.OutputStream;
import java.net.Socket;



public class DTUClient {  
   
   public static void main(String args[]) throws Exception {  
      //为了简单起见，所有的异常都直接往外抛  
      String host = "127.0.0.1";  //要连接的服务端IP地址  
      int port = 9123;   //要连接的服务端对应的监听端口  
      //与服务端建立连接  
      Socket client = new Socket(host, port);  
      byte[] b={0x12};
      OutputStream  out = client.getOutputStream();
      out.write("sss".getBytes());
      client.close();  
   }  
     
}  