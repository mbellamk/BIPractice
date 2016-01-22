package com.bellinfo.day13.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CollectionAssignment2 {

	public static void main(String[] args) {

		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(7);
		integerList.add(8);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);
		integerList.add(6);

		System.out.println("Minimum element in a list is:"+Collections.min(integerList));
		Set<Integer> integerSet = new HashSet<>();
		integerSet.add(10);
		integerSet.add(2);
		integerSet.add(3);
		integerSet.add(12);
		integerSet.add(5);
		integerSet.add(6);
		
		System.out.println("Minimum element in a set is :"+Collections.min(integerSet));
		System.out.println("**Original Order of List**");
		System.out.println(integerList.toString());
		Collections.reverse(integerList);
		System.out.println("**Reverse Order of List**");
		System.out.println(integerList.toString());
		
		TreeMap<Integer,String> treeMap=new TreeMap<>();
		treeMap.put(1, "one");
		treeMap.put(2, "two");
		treeMap.put(3, "three");
		treeMap.put(4, "four");
		treeMap.put(5, "five");
		treeMap.put(6, "six");
		treeMap.put(7, "seven");
		System.out.println("Lowest Key in Tree map is:"+treeMap.firstKey());
		System.out.println("Lowest Key in Tree map is:"+treeMap.lastKey());
		
		Map<Integer,String> hashMap=new HashMap<>();
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(3, "three");
		hashMap.put(4, "four");
		hashMap.put(5, "five");
		hashMap.put(6, "six");
		hashMap.put(7, "seven");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Key:");
		int key=scan.nextInt();
		if(hashMap.containsKey(key)){
			System.out.println("Yes. Key Exists");
		}else{
			System.out.println("Key Not Exists");
		}
		System.out.println("Enter Value");
		String value=scan.next();
		if(hashMap.containsValue(value)){
			System.out.println("Yes. Value Exists");
		}else{
			System.out.println("Value Not Exists");
		}
	}

}
