package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class TestZip {
	public static void main(String[] args) {
		try {
			
			/*ZipInputStream zip = new ZipInputStream(new FileInputStream("d:/hello.zip"));
			ZipEntry entry;
			while((entry=zip.getNextEntry())!=null) {
				System.err.println(entry.getName());
				zip.closeEntry();
			}
			zip.close();*/
			File fis = new File("d:/hello.txt");
			InputStream is = new FileInputStream(fis);
			ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("d:/hello.zip"));
			ZipEntry ze = new ZipEntry(fis.getName());
			zos.putNextEntry(ze);
			int temp = 0;
			while((temp=is.read())!=-1) {
				zos.write(temp);
			}
			zos.closeEntry();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
