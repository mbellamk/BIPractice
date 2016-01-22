package com.bellinfo.day3.package1;

public class CarAndMakeMethodOverridingExample {
	
	public static void main(String[] args)
	{
		
		Car c=new Make();
		//c.models1(1);
		
	}

}

class Car{
	void numberOfWheels(){
		System.out.println("number of wheels");
	}
	
	void modeOfDriving(){
		System.out.println("on the road");
	}
	
	void models()
	{
		System.out.println("All models");
	}
}

class Make extends Car{
	void models(){
		System.out.println("BMW X5");
	}
	
	void models1(int a)
	{
		System.out.println("Inside Make Overloaded Method");
	}
	
	void engine(){
		System.out.println("awesine ride");
	}
}