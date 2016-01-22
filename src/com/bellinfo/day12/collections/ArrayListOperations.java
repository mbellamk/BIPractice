package com.bellinfo.day12.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {

	public static void main(String[] args) {

		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("raghu");
		stringList.add("XYZ");
		stringList.add("234");
		stringList.add("ABC");
		stringList.add("ABC");
		System.out.println("Original List:");
		System.out.println(stringList.toString());
		System.out.println();
		ArrayList<String> stringListWithoutDuplicates = new ArrayList<>();
		ArrayList<String> duplicateStrings = new ArrayList<>();
		for (String s : stringList) {
			if (!stringListWithoutDuplicates.contains(s)) {
				stringListWithoutDuplicates.add(s);
			} else {
				duplicateStrings.add(s);
			}
		}
		System.out.println("List after eliminating duplicates:");
		System.out.println(stringListWithoutDuplicates.toString());
		System.out.println("Duplicate Strings are:");
		System.out.println(duplicateStrings.toString());
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to search for");
		String searchStr = scan.next();
		if (stringList.contains(searchStr)) {
			System.out.println(searchStr + " exists in the list");
		} else {
			System.out.println(searchStr + " does not exists in the list");
		}

		System.out.println();
		Collections.sort(stringList);
		System.out.println("Sorted List is:"+stringList.toString());
		System.out.println("Clearing the list:");
		stringList.clear();
		System.out.println("List after clearing:" + stringList.toString());
	}

}
