package com.equals;

import java.util.ArrayList;
import java.util.List;

public class TestEquals {
	public static void main(String[] args) {
//		Person p = new Person("ss");
//		Person p2 = new Person("ss ");
//		List<Person> list = new ArrayList<Person>();
//		list.add(p);
//		list.add(p2);
//		System.out.println(list.contains(p));
//		System.out.println(list.contains(p2));
		
	/*	Employee e1 = new Employee("ss", 100);
		Employee e2 = new Employee("ss", 1000);
		Person p = new Person("ss");
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(p));
		System.out.println(p.equals(e2));
		System.out.println("*********");
		System.out.println(p.equals(e1));
		System.out.println(p.equals(e2));
		System.out.println(e1.equals(e2));*/
		System.err.println(2/0);
 	}
}


class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj.getClass() == this.getClass()) {
			Person p = (Person) obj;
			if(name != null && p.getName() != null) {
				return name.equalsIgnoreCase(p.getName());
			}
			return false;
		}
		return false;
	}
	
	
}


class Employee extends Person {
	private int id;
	public Employee(String name, int id) {
		super(name);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj.getClass() == this.getClass()) {
			Employee e = (Employee) obj;
			return super.equals(obj) && e.getId() == id;
		}
		return false;
	}
	
	
}