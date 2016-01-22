package com.bellinfo.assignments.assignment2;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {

		int choice = 0;
		do {
			System.out.println("Please enter a number");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			int fact = fact(num);
			System.out.println("Factorial of " + num + " is " + fact);
			System.out.println("Please enter 1 to repeat and 2 to end");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
		} while (choice == 1);
	}

	static int fact(int n) {
		if (n == 1)
			return n;

		return n * fact(n - 1);

	}

}
