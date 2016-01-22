package com.bellinfo.day12.collections;

import java.util.ArrayList;

public class ArrrayListAssignment {

	public static void main(String args[]) {

		// Adding numbers to the list
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("str1");
		stringList.add("str2");
		stringList.add("str3");
		stringList.add("str4");
		stringList.add("str5");
		stringList.add("str6");
		stringList.add("str7");

		System.out.println("Original List:");
		System.out.println(stringList.toString());

		stringList.remove(3);
		System.out.println("List after removing the fourth element");
		System.out.println(stringList.toString());

		ArrayList<Float> floatList = new ArrayList<Float>();
		floatList.add(10.0f);
		floatList.add(11.0f);
		floatList.add(12.0f);
		floatList.add(13.0f);
		floatList.add(14.0f);
		floatList.add(15.0f);
		floatList.add(16.0f);
		
		ArrayList<Float> copiedFloatList = new ArrayList<Float>();
		copiedFloatList.addAll(floatList);
		System.out.println();
		System.out.println("Copied Float List:");
		System.out.println(copiedFloatList.toString());
	}
}
