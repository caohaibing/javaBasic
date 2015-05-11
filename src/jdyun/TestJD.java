package jdyun;

import java.io.File;
import java.net.URI;


import com.jcloud.jss.JingdongStorageService;
import com.jcloud.jss.http.Method;

public class TestJD {

	
	
	static JingdongStorageService jss = new JingdongStorageService("71775880b41d46ec96c812272a0ccb6e", "c033c36fbc0b4c279fbf5b80e81de71cnsITxymd");
	
	
	public static boolean upload(File file, String appname, String app_version) { 
		boolean flag = true;
		try {
			jss.bucket("fmapp").object(appname+"_"+app_version+".apk").entity(file).put();
		} catch (Exception e) {
			flag = false;
		} finally {
			jss.destroy();
		}
		return flag;
	}
	
	public static String download() {
		URI uri = jss.bucket("mifm").object("mifm_0.94.2.apk").generatePresignedUrl(3600, Method.GET);
		System.err.println(uri);
		return null;
	}
	
	public static void main(String[] args) {
		download();
	}
	

}
