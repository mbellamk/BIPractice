package com.practice.java.tpoint;

class A {
	{
		System.out.println("Base Class Initializer");
	}
	
	static{
		System.out.println("Parent Static block invoked");
	}
	A() {
		System.out.println("parent class constructor invoked");
	}
}

abstract class B3 extends A {
	static{
		System.out.println("Static block invoked");
	}
	{
		System.out.println("Child Class Initializer");
	}
	B3() {
		
		super();
		
		System.out.println("child class constructor invoked");
	}

	B3(int a) {
		super();
		System.out.println("child class constructor invoked " + a);
	}

	
	public static void main(String args[]) {
		 int a=0;
		 System.out.println("Abstract class Main method is invoked");
		 /*A an=new B3();
		 B3 b=(B3)an;*/
		//B3 b1 = new B3();
		/*B3 b2 = new B3(10);*/
	}
}
