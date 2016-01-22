package com.practice.java.tpoint;

public class InheritanceScenario {

	public static void main(String arg[]) {
		Child c = new Child();
		char c1=0x1234;
		char c2='\u1234';
		System.out.println("c1:"+c1);
	}
}

class Parent {
	{
		System.out.println("Parent class initializer invoked");
	}

	Parent() {
		System.out.println("Parent class Constructor invoked");
	}
}

class Child extends Parent {
	{
		System.out.println("Child class initializer invoked");
	}

	Child() {
		System.out.println("Child class constructor invoked");
	}
	
	public void method1(){
		//super();
		
	}
}

class Test{
	Test(){
		this((byte)4);
	}
	
	Test(byte var){
		System.out.println(var);
	}
}