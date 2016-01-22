package com.bellinfo.assignments.assignment2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int choice = 0;
		do {
			System.out.println("Please enter a number");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			int backupNum = num;
			int revNum = 0;
			do {
				int rem = num % 10;
				num = num / 10;
				revNum += (rem);
				revNum = revNum * 10;
			} while (num > 0);

			System.out.println("Reversal of " + backupNum + " is:" + revNum
					/ 10);
			System.out.println("Enter 1 to repeat again 2 to end");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
		} while (choice == 1);

	}
}
