package com.bellinfo.day5.package1;

import java.util.Scanner;

public class ArrayScenario2 {

	public static void main(String[] args) {
		int idArray[];
		/*
		 * name-String fee- double Section-char 2. which section student details
		 * required? Apply Arrays on your objects(Phone)
		 */
		/*System.out.println("Please enter count of numbers");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		idArray = new int[count];
		for (int i = 0; i < idArray.length; i++) {
			System.out.println("Please enter number" + (i + 1));
			idArray[i] = scan.nextInt();
		}
*/
		/*
		 * System.out.println("Numbers are"); for (int i = 0; i <
		 * idArray.length; i++) { System.out.println(idArray[i]); }
		 */

		Student s = new Student();
		s.setId(1);
		s.setName("Raghav");
		System.out.println("Id:"+s.getId()+", Name:"+s.getName());

	}
}

class Student {
	private int id;
	private String name;

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
