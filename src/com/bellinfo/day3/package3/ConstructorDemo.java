package com.bellinfo.day3.package3;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a=new A2();
		System.out.println("a="+a.a+"\nb="+a.b+"\nc="+a.c+"\nd:"+a.d+"\ne="+a.e);
		System.out.println();
		System.out.println("a1 Object:");
		A2 a1=new A2(5);
		System.out.println("a="+a1.a+"\nb="+a1.b+"\nc="+a1.c+"\nd:"+a1.d+"\ne="+a1.e);
	}

}

class A1{
	
	int a,b,c;
	A1(){
		super();
		a=1;
		b=2;
		c=3;
	}
	A1(int a)
	{
		super();
		this.a=a;
		b=2;
		c=3;
	}
}

class A2 extends A1{
	int d,e;
	
	A2()
	{
		d=4;
		e=5;
	}
	
	A2(int a)
	{
		super(a);
		d=4;
		e=5;
	}
}
