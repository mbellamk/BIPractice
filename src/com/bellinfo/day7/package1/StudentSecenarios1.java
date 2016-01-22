package com.bellinfo.day7.package1;

public class StudentSecenarios1 {

	public static void main(String[] args) {

		String s1 = "orange";
		String s2 = "orange";
		String s3 = new String("orange");
		String s4 = new String("orange");
		
		if(s1.equals(s3)){
		System.out.println("Same");	
		}else{
			System.out.println("Not Same");
		}
		if (s1 == s2) {
			System.out.println("s1 and s2 are same");
		} else {
			System.out.println("s1 and s2 are not same");
		}

		if (s1 == s3) {
			System.out.println("s1 and s4 are same");
		} else {
			System.out.println("s1 and s4 are not same");
		}

		if (s3 == s4) {
			System.out.println("s3 and s4 are equal");
		} else {
			System.out.println("s3 and s4 are not equal");
		}
	}

}

class A{
	int a;

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
	
}
