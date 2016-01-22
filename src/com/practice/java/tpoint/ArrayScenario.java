package com.practice.java.tpoint;

public class ArrayScenario {

	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 5 };
		//ChangeIt.doIt(a);
		changeIt(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		String[] names=new String[0];
	}

	public static void changeIt(int[] a) {
		//a[0] = 99;
		a=null;
	}
}

class ChangeIt {
	static void doIt(int[] z) {
		int[] A = z;
		A[0] = 99;
	}
}
