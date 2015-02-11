package com.serialize;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = -1999343135687063050L;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
