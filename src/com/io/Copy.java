package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) {
		String fileFrom = "D:/文档/07阶段_J2EE学习视频_01_框架学习视频_Struts2/00_源码与文档.rar";
		String fileTo = "d:/00_源码与文档.avi";
		Copy.copy(fileFrom, fileTo);
	}

	private static void copy(String fileFrom, String fileTo) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(fileFrom);
			out = new FileOutputStream(fileTo);
			byte[] bt = new byte[2048];
			int count;
			while ((count = in.read(bt)) > 0) {
				out.write(bt, 0, count);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
}
