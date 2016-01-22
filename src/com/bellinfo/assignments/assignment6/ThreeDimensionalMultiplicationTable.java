package com.bellinfo.assignments.assignment6;

import java.util.Scanner;

public class ThreeDimensionalMultiplicationTable {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int choice = 0;
		do {
			int num = scanNumber(s);
			printNumbers(num);
			System.out.println("Enter 1 to continue");
			choice = s.nextInt();
		} while (choice == 1);
	}

	static int scanNumber(Scanner s) {
		System.out.println("Please enter a number");
		return s.nextInt();
	}

	static void printNumbers(int num) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int result = num * i * j;
				System.out.println(num + "*" + i + "*" + j + "=" + result);
			}

		}
	}
}
