package com.bellinfo.assignments.assignment2;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int choice;
		do {
			System.out.println("Please enter a number:");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			int sum = 0;
			boolean primeStatus = true;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum += i;

				}
			}
			if (num == sum) {
				System.out.println("Perfect Number");
			} else {
				System.out.println("Not a Perfect Number");
			}
			System.out.println("Enter 1 to repeat again 2 to end");
			Scanner scan1 = new Scanner(System.in);
			choice = scan1.nextInt();
		} while (choice == 1);
	}
}
