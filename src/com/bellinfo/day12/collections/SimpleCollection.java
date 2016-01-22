package com.bellinfo.day12.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleCollection {

	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);
		integerList.add(6);

		for (int i = 0; i <= integerList.size() - 1; i++) {
			System.out.print(integerList.get(i)+" ");
		}

		Iterator<Integer> ii = integerList.iterator();
		System.out.println();
		System.out.println("Using Iterator To Print Data:");
		while (ii.hasNext()) {
			System.out.print(ii.next()+" ");
		}

		System.out.println();
		System.out.println("Using For each:");
		
		for(Integer i:integerList){
			System.out.print(i+" ");
		}
		System.out.println();
		

		System.out.println(integerList.toString());

		Integer a = (Integer) integerList.get(0);
		Integer b = (Integer) integerList.get(1);
		Integer c = (Integer) integerList.get(2);

		System.out.println(a + b + c);

	}

}
