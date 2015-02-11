package com.string;

import java.util.HashMap;
import java.util.Map;

public class OverrideToString {
	public static void main(String[] args) {
/*		Map<Person, Object> map = new HashMap<Person, Object>() {
			{
				put(new Person("ss"), new Object());
			}
		};
		
		System.out.println(map.containsKey(new Person("ss")));*/
		
		System.out.println(new Person("ss").toString());
	}
}

class Person {
	private String name;
	private int age;
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

/*	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}*/
	
	public String toString() {
		return String.format("%s.name=%s", this.getClass(), name);
	}
}
