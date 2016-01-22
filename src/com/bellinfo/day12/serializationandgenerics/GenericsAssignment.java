package com.bellinfo.day12.serializationandgenerics;

import java.util.Arrays;

public class GenericsAssignment {
	public static void main(String args[]) {
		StudentGenerics<Student> s = new StudentGenerics<Student>(3);
		Student s1 = new Student();
		s1.setName("Raghu");
		s1.setMarks(20);
		s1.setFee(10.0);
		s.addStudent(s1);

		s1 = new Student();
		s1.setName("Padma");
		s1.setMarks(30);
		s1.setFee(11.0);
		s.addStudent(s1);

		s1 = new Student();
		s1.setName("Gowri");
		s1.setMarks(40);
		s1.setFee(12.0);
		s.addStudent(s1);

		System.out.println(s.toString());
	}
}

class StudentGenerics<T> {
	private T[] students;
	private int index=0;

	public T[] getStudents() {
		return students;
	}
	
	public StudentGenerics(int count) {
		students=(T[]) new Object[count];
	}

	public void addStudent(T student) {
		
		students[index]=student;
		index++;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "StudentGenerics: " + Arrays.toString(students);
	}

}

class Student {

	private String name;
	private int marks;
	private double fee;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", fee=" + fee
				+ "]";
	}

}
