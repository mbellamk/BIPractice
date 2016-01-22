package com.bellinfo.assignments.assignment2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String args[]) {
		int choice = 0;
		do {
			System.out.println("Please enter a number");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			int backUpNum = num;
			int armNum = 0;
			int power = Integer.toString(num).length();
			do {
				int rem = num % 10;
				num = num / 10;
				armNum += Math.pow(rem, power);

			} while (num > 0);
			if (armNum == backUpNum) {
				System.out.println("Armstrong Number");
			} else {
				System.out.println("Not a Armstrong Number");
			}
			System.out.println("Please enter 1 to repeat again and 2 to end");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();

		} while (choice == 1);
	}
}
