package com.construction;

public class Student extends Person{
	private int age;
	public Student(int age) {
		this.setAge(age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		new Student(12).test();
	}
	
	public void test() {
		System.err.println(getClass().getSuperclass().getName());
	}
	
}
