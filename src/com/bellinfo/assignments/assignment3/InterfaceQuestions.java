package com.bellinfo.assignments.assignment3;

public class InterfaceQuestions {
	public static void main(String args[]) {
		System.out
				.println("1. implemented Two interfaces with same method name & signature and same return type");
		System.out
				.println("2. cannot implement Two interfaces with same method name with different return type.");
		System.out
				.println("3. adding a static block and instance block inside interface ?- The interface cannot define an initializer");
		System.out
				.println("4. Add a static block and instance block inside abstract class and identify the sequence of execution ?- Static block will be executed before the object creation and instance block is executed after the object creation");
		System.out
				.println("5. Create a class static block, instance block and default constructor. create object for the same class and let me know the sequence of execution ?- Static block, instance block, constructor");
		System.out
				.println("6. Create object for a class which implements two interfaces and an abstract class and verify the visibility of all the methods(both dummy and concrete).- You can increase the visibility of overridden methods");
		System.out
				.println("7. Child class Methods and variables are invisible- Only behavior is overridden when you extend the class but not state");
		System.out.println("10. we cannot override a constructor");
		System.out.println("11. Yes we can overload the constructor");
		System.out
				.println("12. Java Follows both Pass by value and Pass by Reference. For primitive types it will follow Pass by Value and for objects it will follow Pass by Reference");
		System.out
				.println("13. Instance Variables - Sysnchronized and abstract are not allowed,	Methods- transient and volatile are not allowedclass- abstract, final and public are allowed. Private and protected are allowed for inner class");
		InterfaceScenarios i = new InterfaceScenarios();
		i.abstractMethod1();
		i.abstractClassMethod1();
		StaticInstanceDefaultConstructorExample s = new StaticInstanceDefaultConstructorExample();
		P p = new C();
		p.pMethod1();
		p.pMethod2();
		System.out.println(p.a);
		System.out.println(p.b);

	}
}

interface ABCInterface {
	/*
	 * static { System.out.println("Instance Block inside Interface"); }
	 */
	int method1();

	void method2();
}

interface DEFInterface {
	int method1();
	// char method2();
}

abstract class AbstractClass {
	static {
		System.out.println("Inside Abstract class Static block");
	}
	{
		System.out.println("Inside Abstract class instance block");
	}

	protected abstract void abstractMethod1();

	protected void abstractClassMethod1() {
		System.out.println("Concrete Method abstractClassMethod1");
	}
}

class InterfaceScenarios extends AbstractClass implements ABCInterface,
		DEFInterface {

	public int method1() {
		System.out.println("Inside Implemented Method1");
		return 1;
	}

	@Override
	public void method2() {

		System.out
				.println("Cannot implement two interfaces which is having same method name and different return type");

	}

	@Override
	public void abstractMethod1() {

		System.out.println("Inside implemented Abstract Method1");

	}

	@Override
	public void abstractClassMethod1() {

		System.out.println("Inside implemented Abstract Method1");

	}

}

class StaticInstanceDefaultConstructorExample {

	static {

		System.out
				.println("Inside StaticInstanceDefaultConstructorExample Static block");

	}
	{

		System.out
				.println("Inside StaticInstanceDefaultConstructorExample Instance block");

	}

	public StaticInstanceDefaultConstructorExample() {
		System.out
				.println("Inside StaticInstanceDefaultConstructorExample Constructor");
	}
}

class P {
	int a = 2, b = 3;

	void pMethod1() {

		System.out.println("In Parent pMethod1()");
	}

	void pMethod2() {
		System.out.println("In Parent pMethod2()");
	}
}

class C extends P {

	int a = 4, b = 5;
	int c = 6;

	void pMethod1() {
		System.out.println("In Child Method pMethod1()");
	}

	void cMethod1() {
		System.out.println("In Child Method cMethod1()");
	}

}