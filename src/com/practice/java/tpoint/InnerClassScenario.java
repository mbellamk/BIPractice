package com.practice.java.tpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class InnerClassScenario {

	public static void main(String args[]) {
		LocalInnerClass l1 = new LocalInnerClass();
		l1.method1();
		String s = new String("ABC");
		String s1 = "XYX";
		// s=s1+s;
		s.replace('A', 'C');
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(7);
		intList.add(8);
		intList.add(7);
		// intList.get(7);
		NavigableSet<Integer> set = new TreeSet<>();
		set.add(1);
		System.out.println(s);
		try {
			method1();
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");
		}

	}

	static void method1() {
		throw new Error();
	}
}

class LocalInnerClass {

	void method1() {
		final int a = 0;
		class Local {
			public int b;

			void localMethod1() {
				System.out.println(a);
			}
		}

		Local l = new Local();
		l.localMethod1();
	}
}


class empty{

	void method1(){
		System.out.println("Hello");
	}
}