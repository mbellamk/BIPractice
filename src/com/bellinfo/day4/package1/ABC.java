package com.bellinfo.day4.package1;

public class ABC {

	public static void main(String args[]) {
		Student s = new Student();
		s.id = 3;
		Person p = (Person) s;
		// Student s =(Student)new Person();
		p.method1();
		System.out.println(p.getId());
		System.out.println(p.name);
	}
}

class Person {
	int id = 1;
	String name="Person";

	void method1() {
		System.out.println(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}

class Student extends Person {
	int id = 2;
	String name = "raghu";

	void method1() {
		System.out.println(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}