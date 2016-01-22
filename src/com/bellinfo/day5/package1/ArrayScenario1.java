package com.bellinfo.day5.package1;

import java.util.Scanner;

public class ArrayScenario1 {

	public static void main(String args[]) {
		// declaration and initializing the Array
		int arrayOfInt[] = new int[] { 1, 2 };

		// declaration of an arrray with size
		int arrayOfInt1[] = new int[4];

		// another way of declaration of an array with size
		int []arrayOfInt2 = new int[2];

		// another way of declaration and initializing of the array
		int[] arrayOfInt3 = new int[] { 2, 3, 4 };

		// another way declaration and initializing of the Array
		int arrayOfInt4[] = { 1, 2, 3 };
		
		/*arrayOfInt1[0]=123;
		arrayOfInt1[1]=1232;
		arrayOfInt1[2]=13;
		arrayOfInt1[3]=1;*/
		
		
		int array[];
		System.out.println("Please enter count of numbers");
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		array=new int[count];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Please enter number"+(i+1));
			array[i]=scan.nextInt();
		}
		
		System.out.println("Numbers are");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}
