package com.serialize;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Cusomer {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Person p = (Person) SerializationUtil.readObject();
		System.out.println(p.getName());
		
	}
}
