package com.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationUtil {
	private static String FILE_NAME = "d:/obj.txt";
	public static void writeObject(Serializable e) throws FileNotFoundException, IOException {
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
		oss.writeObject(e);
		oss.close();
	}
	
	public static Object readObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		Object obj = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
		obj = ois.readObject();
		ois.close();
		return obj;
	}
}
