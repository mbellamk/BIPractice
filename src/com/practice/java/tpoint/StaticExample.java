package com.practice.java.tpoint;

public class StaticExample {

	
	public static void main(String args[]){
		Class2 c2=new Class2();
		Class2.method1();
		c2.method2();
		
	}
	
}

class Class1 extends StaticExample{
	
	Class1(int a, int b){
		System.out.println(a+" "+b);
	}
	
	public static void method1(){
		System.out.println("Parent class Method1");
	}
}

class Class2 extends Class1{
	
	Class2() {
		super(0, 0);
		
	}

	public static void method1(){
		System.out.println("Child Class Method1");
	}
	
	public void method2(){
		
	}
}
