package com.hashcode;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public Person(String name) {
		this.name=name;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		} 
		if(this == obj) {
			return true;
		}
		if(obj instanceof Person) {
			Person person = (Person)obj;
			if(person.getName().equals(this.getName())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(name).hashCode();
	}
	
}
