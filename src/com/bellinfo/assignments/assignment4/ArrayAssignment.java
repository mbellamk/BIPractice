package com.bellinfo.assignments.assignment4;

import java.util.Scanner;

public class ArrayAssignment {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter count of number of students");
		int count=scan.nextInt();
		int idArray[]=new int[count];
		String nameArray[]=new String[count];
		double feeArray[]=new double[count];
		char sectionArray[]=new char[count];
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter Student"+(i+1)+" id");
			idArray[i]=scan.nextInt();
			System.out.println("Enter Student"+(i+1)+" Name");
			nameArray[i]=scan.next();
			System.out.println("Enter Student"+(i+1)+" Fee");
			feeArray[i]=scan.nextDouble();
			System.out.println("Enter Student"+(i+1)+" Section");
			sectionArray[i]=scan.next().charAt(0);
		}
		
		System.out.println("Enter which section students you want to see:");
		char enteredSection=scan.next().charAt(0);
		
		System.out.println("************RESULT***********");
		System.out.println("ID Name    Fee  Section");
		
		for(int i=0;i<count;i++)
		{
			if(Character.toLowerCase(sectionArray[i])==Character.toLowerCase(enteredSection))
			System.out.println(idArray[i]+"  "+nameArray[i]+"  "+feeArray[i]+"  "+sectionArray[i]);
		}
	}

}
