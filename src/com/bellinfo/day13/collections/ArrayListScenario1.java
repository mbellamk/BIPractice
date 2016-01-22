package com.bellinfo.day13.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListScenario1 {

	public static void main(String[] args) {

		ArrayListScenario1 a1=new ArrayListScenario1();
		a1.displayCountries();
	}
	
	public void displayCountries(){
		ArrayList<String> countries=new ArrayList<>();
		countries.add("india");
		countries.add("usa");
		countries.add("canada");
		countries.add("mexico");
		
		
		Collections.shuffle(countries);
		System.out.println("**after Shuffling **");
		System.out.println(countries.toString());
		
		TreeSet<String> ts=new TreeSet<>();
		ts.addAll(countries);
		System.out.println("** Sorting with Tree Set **");
		for(String country:ts){
			System.out.println(country);
		}
		
		//Displaying using Vector
		System.out.println("**displaying using Vectors**");
		Vector<String> v=new Vector<>();
		v.addAll(countries);
		for(String country:v){
			System.out.println(country);
		}
		
		//converting array to arraylist
		String[] str={"red","white","yellow","purple"};
		List<String> colorList=Arrays.asList(str);
		//displaying after converting an array to arrayList
		System.out.println("**Converting arrays to List**");
		for(String color:colorList){
			System.out.println(color);
		}
	}

}
