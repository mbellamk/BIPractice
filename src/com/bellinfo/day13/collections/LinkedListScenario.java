package com.bellinfo.day13.collections;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListScenario {

	public static void main(String args[]) {
		


		LinkedList<Movies> movies = new LinkedList<>();
		HashSet<Movies> moviesHashSet = new HashSet<>();
		Movies m1 = new Movies();
		m1.setName("NPT");
		m1.setRating(4);
		m1.setLanguage("Telugu");
		movies.add(m1);
		moviesHashSet.add(m1);

		m1 = new Movies();
		m1.setName("BB");
		m1.setRating(3);
		m1.setLanguage("Telugu");
		movies.add(m1);
		moviesHashSet.add(m1);

		m1 = new Movies();
		m1.setName("SSR");
		moviesHashSet.add(m1);
		m1.setRating(4);
		m1.setLanguage("Telugu");
		movies.add(m1);
		moviesHashSet.add(m1);

		m1 = new Movies();
		m1.setName("SSR");
		m1.setRating(2);
		m1.setLanguage("English");
		movies.add(m1);
		moviesHashSet.add(m1);

		m1 = new Movies();
		m1.setName("SSR");
		m1.setRating(2);
		m1.setLanguage("English");
		movies.add(m1);
		moviesHashSet.add(m1);

		Movies m = movies.getLast();
		System.out.println("**Last Element**");
		System.out.println(m);

		// Retrieving data from HashSet
		System.out.println("**Using HashSet Eliminates Duplicates**");
		for (Movies mm : moviesHashSet) {
			System.out.println(mm);
		}
		
		HashSet<String> strSet=new HashSet<>();
		String s1=new String("ABC");
		String s2=new String("DEF");
		strSet.add(s1);
		strSet.add(s2);
		
		System.out.println(strSet);
		
		String s="ABC";
		String s11="DEF";
		System.out.println(s.compareTo(s11));
		s.length();
	
	}
}
