package com.bellinfo.assignments.assignment4;

import java.util.Scanner;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		Student studentArray[];
		/*
		 * name-String fee- double Section-char
		 *Register.html and login.html page
		 *Style the form
		 *First Name-10
		 *Last Name-10
		 *Email
		 *Phone Number(optional)
		 *Username-5
		 *Password
		 *Register button - hyperlink to login.html
		 *Registration Succesful. 
		 *Loign - Username Password, Submit
		 *
		 */
		System.out.println("Please enter count of numbers");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		studentArray = new Student[count];
		for (int i = 0; i < studentArray.length; i++) { 
			System.out.println("Please enter student" + (i + 1)+" Id");
			Student s = new Student();
			s.setId(scan.nextInt());
			System.out.println("Please enter student" + (i + 1)+" Name");
			s.setName(scan.next());
			System.out.println("Please enter student" + (i + 1)+" Fee");
			s.setFee(scan.nextDouble());
			System.out.println("Please enter student" + (i + 1)+" Section");
			s.setSections(scan.next().charAt(0));
			studentArray[i]=s;
		}

		System.out.println("************RESULT***********");
		System.out.println("ID Name    Fee  Section");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].toString());
		}

	}

}

class Student {

	private int id;
	private String name;
	private double fee;
	private char sections;

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

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public char getSections() {
		return sections;
	}

	public void setSections(char sections) {
		this.sections = sections;
	}

	@Override
	public String toString() {
		return id + "  " + name + "  " + fee + "  "
				+ sections;
	}

}
