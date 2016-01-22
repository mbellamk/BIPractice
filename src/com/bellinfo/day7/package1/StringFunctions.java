package com.bellinfo.day7.package1;

public class StringFunctions {

	public static void main(String[] args) {

		String s = "This is a java class";
		System.out.println("How many words in a String?" + s.split(" ").length);
		System.out.println("Length of the String?" + s.length());
		String reverseWord = "";
		String reverseString = "";
		int singleCharacterCount = 0;
		String strChar[] = s.split(" ");
		for (String str : s.split(" ")) {
			if (!reverseWord.equals("")) {
				reverseWord += " ";
			}
			if (str.length() == 1) {
				singleCharacterCount++;
			}
			char c[] = str.toCharArray();
			String s1 = "";
			for (int j = (str.length() - 1); j >= 0; j--) {
				s1 += c[j];
			}
			reverseWord += s1;
		}
		for (int i = strChar.length - 1; i >= 0; i--) {
			if (!reverseString.equals("")) {
				reverseString += " ";
			}
			char c[] = strChar[i].toCharArray();
			String s1 = "";
			for (int j = (strChar[i].length() - 1); j >= 0; j--) {
				s1 += c[j];
			}
			reverseString += s1;
		}
		System.out.println("How many single character words in the String? "
				+ singleCharacterCount);
		System.out.println("Reverse each word ? " + reverseWord);
		System.out.println("Reverse entire String :" + reverseString);
		System.out
				.println("Replace java with SQL: " + s.replace("java", "SQL"));
		System.out.println("Letter at the center:" + s.charAt(s.length() / 2));
		System.out.println("Index of j at center:" + s.indexOf("j"));
		char c1[] = s.toCharArray();
		char letter[] = new char[c1.length];
		int count[] = new int[c1.length];
		int nextIndexCount = 0;
		for (int i = 0; i < c1.length; i++) {
			int letterCount = 1;
			for (int j = (i + 1); j < c1.length; j++) {
				if (c1[i] == c1[j]) {
					letterCount++;
				}
			}
			String sArray = new String(letter);
			if (c1[i] != ' ' && !sArray.contains(String.valueOf(c1[i]))) {
				letter[nextIndexCount] = c1[i];
				count[nextIndexCount] = letterCount;
				nextIndexCount++;
			}

		}
		System.out.println("Number of times each letter repeated:");
		
		for (int i = 0; i < nextIndexCount; i++) {
			
			System.out.println(letter[i] + " repeated " + count[i] + " times");
		}
		
		System.out.println("Identify a letter which is not repeated.");
		for (int i = 0; i < nextIndexCount; i++) {
			if(count[i]==1)
			{
				System.out.println(letter[i] + " repeated only once");
			}
			
		}
		
		System.out.println("Identify the index of each word");
		int fromIndex=0;
		for(String st:s.split(" "))
		{
			
			System.out.println("Index of "+st+" is "+s.indexOf(st,fromIndex));
			fromIndex+=st.length();
		}
		
		System.out.println("Convert the entire String in to upper case ? "+s.toUpperCase());

	}

}
