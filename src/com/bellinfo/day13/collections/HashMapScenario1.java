package com.bellinfo.day13.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapScenario1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Siva");
		hm.put(2, "Raghav");
		hm.put(3, "chaitanya");

		Set<Integer> set = hm.keySet();

		System.out.println("***Retrieving HashMap using Key Set***");
		for (Integer i : set) {
			System.out.println("Key: " + i + " value:" + hm.get(i));
		}
		
		System.out.println("***Retrieving HashMap using Entry Set***");
		for(Map.Entry<Integer, String> me:hm.entrySet())
		{
			System.out.println("key: "+me.getKey()+" value:"+me.getValue());
		}
	}

}
