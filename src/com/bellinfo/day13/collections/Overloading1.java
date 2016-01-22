package com.bellinfo.day13.collections;

public class Overloading1 {
	public static void main(int a) {
		System.out.println(a);
	}

	public static void main(String args[]) {
		System.out.println("main() method invoked");
		//main(10);
		A a=new A();
		a.method1(10,10);
	}
}

class A{
	
	void method1(int a, int b){
		System.out.println("int method is called:"+b);
		
	}
	
	void method1(long a, long b){
		System.out.println("long method is called:"+b);
		
	}
}
