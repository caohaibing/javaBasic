package com.exception;

import java.util.zip.DataFormatException;

public class TestFinally {
	public static void main(String[] args) {
		try {
			System.out.println(doff(-1));
			System.out.println(doff(100));
		} catch (Exception e) {
			System.out.println("never");
		}
	}

	private static int doff(int i) throws Exception{
		int a = 0;
		try {
			
		if(i < 0) {
			throw new DataFormatException("数据格式转换错误");
		} else {
			return i;
		}
		} catch (Exception e) {
			throw e;
		} finally {
			a = 1;
		}
	}
}
