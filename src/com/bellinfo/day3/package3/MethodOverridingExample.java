package com.bellinfo.day3.package3;

public class MethodOverridingExample {

	public static void main(String[] args)
	{
		A a=new A();
		a.method();
		a.notOverrideMethod();
		B b=new B();
		b.method();
		b.notOverrideMethod();
		b.methodInB();
		
	}
}


class A{
	
	void method(){
		System.out.println("inside methodA of class A");
	}
	
	void notOverrideMethod(){
		System.out.println("inside A");
	}
}

class B extends A{
	void method(){
		System.out.println("inside method of class B");
	}
	
	void methodInB(){
		System.out.println("Inside Method in B");
	}
}