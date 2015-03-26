package com.simulationHibernate;


public class StudentManager {
	public static void main(String[] args) throws Exception {
		Student student = new Student();
		student.setId(12);
		student.setAge(45);
		student.setName("test");
		Session session = new Session();
		session.save(student);
	}
}
