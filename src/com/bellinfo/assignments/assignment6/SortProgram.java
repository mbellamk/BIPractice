package com.bellinfo.assignments.assignment6;

import java.util.Scanner;

public class SortProgram {

	public static void main(String[] args) {

		int choice = 0;
		do {
			Scanner s = new Scanner(System.in);
			int a[] = receiveNumbersFromConsole(s);
			a = sortNumbers(a);
			printNumbers(a);
			System.out.println("Enter 1 to repeat");
			choice = s.nextInt();
		} while (choice == 1);
	}

	private static void printNumbers(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

	private static int[] sortNumbers(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	private static int[] receiveNumbersFromConsole(Scanner s) {

		System.out.println("Enter count  of numbers");
		int count = s.nextInt();
		int a[] = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Enter number" + (i + 1));
			a[i] = s.nextInt();
		}
		return a;
	}
}
