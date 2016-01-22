package com.bellinfo.assignments.assignment2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int choice = 0;
		do {
			System.out.println("Please enter a number");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			int n1=0,n2=1;
			int nextSeq=n1+n2;
			System.out.print(n1+" "+n2);
			do{
				System.out.print(" "+nextSeq);
				n1=n2;
				n2=nextSeq;
				nextSeq=n1+n2;
				
			}while(nextSeq<num);
			System.out.println();
			System.out.println("Please enter 1 to repeat and 2 to end");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
		} while (choice == 1);
	}

}
