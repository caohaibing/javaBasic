package com.serialize;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Producer {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Person p = new Person();
		p.setName("他不敢去");
		SerializationUtil.writeObject(p);
	}
}
