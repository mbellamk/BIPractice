package com.bellinfo.day4.package1;

import java.util.ArrayList;

public class InterfaceExample {

	public static void main() {

		ArrayList<Integer> a = new ArrayList();
		method1(a);
	}

	public static void method1(ArrayList<Integer> a) {
		method2(a);
	}

	public static void method2(ArrayList<Integer> a) {

	}
}

interface CarInterface {
	void symbol();
}

abstract class AudiAbstractClass implements CarInterface {
	public void symbol() {
		System.out.println("On Gas");
	}
}

class AudiQ5 extends AudiAbstractClass {
	public void symbol() {
		System.out.println("00000");
	}
}

class AudiQ3 extends AudiAbstractClass {
	public void symbol() {
		System.out.println("000");
	}
}