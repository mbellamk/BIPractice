package com.practice.interview.google;

import java.util.ArrayList;
import java.util.List;

public class GoogleInterviewQuestions {

	public static void main(String args[]){
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		List<Integer> reverseIntList=new ArrayList<Integer>();
		for(int i=intList.size()-1;i>=0;i--){
			reverseIntList.add(intList.get(i));
		}
		
		for(Integer i:reverseIntList)
		{
			System.out.println(i);
		}
	}
}
