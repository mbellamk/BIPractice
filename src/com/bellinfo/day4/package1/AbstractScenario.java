package com.bellinfo.day4.package1;

public class AbstractScenario {

	public static void main(String[] args) {

		Audi audi = new Audi();
		Honda honda = new Honda();
		audi.engineRunOn();
		honda.engineRunOn();
		audi.symbol();
		honda.symbol();
		Car a=new Audi();
	}

}

abstract class Car {
	void engineRunOn() {
		System.out.println("on Gas");
	}

	abstract void symbol();
}

class Audi extends Car {

	@Override
	void symbol() {
		System.out.println("&HDS");
	}
}

class Honda extends Car {
	void symbol() {
		System.out.println("$$DSA");
	}
}

abstract class Car2 extends Car{
	
}