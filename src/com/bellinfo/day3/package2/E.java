package com.bellinfo.day3.package2;

import com.bellinfo.day3.package1.A;

public class E {

	public void eMethod1()
	{
		A a=new A();
		//int a1=a.a;
		//int b1=a.b;
		//int c1=a.c;
		System.out.println("Inside eMethod1:");
		System.out.println("a:Not Accessible\nb:Not Accessible\nc:Not Accessible\nd:"+a.d);
	}
}
