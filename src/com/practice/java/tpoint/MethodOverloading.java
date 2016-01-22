package com.practice.java.tpoint;

public class MethodOverloading {

	public static void main(String args[]){
		
		OverloadingScenario os=new OverloadingScenario();
		//os.method1(10.0, 10);
	}
}


class OverloadingScenario{
	
	public void method1(int a, double b){
		System.out.println("1st method called");
	}
	
	public void method1(double a, int b){
		System.out.println("2nd Method called");
	}
}