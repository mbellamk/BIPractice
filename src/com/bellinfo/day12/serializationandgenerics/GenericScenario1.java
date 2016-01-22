package com.bellinfo.day12.serializationandgenerics;

public class GenericScenario1 {

	public static void main(String[] args) {
		Basket<Integer> x=new Basket<>();
		x.setA(10);
		System.out.println(x.getA());
		
		Basket<String> str=new Basket<>();
		str.setA("Generics");
		System.out.println(str.getA());

	}

}

class Basket<T>{
	private T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
	
}
