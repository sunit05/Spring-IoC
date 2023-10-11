package com.jsp.student.constructorinjection;

public class Student {
	int id;
	String name;
	String mail;

	Student(int id, String name, String mail) {
		this.id = id;
		this.name = name;
		this.mail = mail;
	}
	public void studentDetails(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(mail);
	}
}
