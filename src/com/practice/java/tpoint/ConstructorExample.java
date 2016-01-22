package com.practice.java.tpoint;

public class ConstructorExample {

	static{
		System.out.println("Inside Static block");
	}
	public static void main(String args[]){
		ConstructorScenario cs=new ConstructorScenario();
		cs.ConstructorScenario();
	}
}

class ConstructorScenario{
	
	int id;
	String name;
	
	public ConstructorScenario(){
		System.out.println("Values:"+id+" "+name);
	}
	
	public void ConstructorScenario() {
		System.out.println("method with constructor Name");
	}
}
