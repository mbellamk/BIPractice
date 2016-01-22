package com.bellinfo.day3.package2;

import com.bellinfo.day3.package1.A;

public class D extends A{

	public void dMethod1()
	{
		//int a1=a;
		//int b1=b;
		
		System.out.println("Inside dMethod1:");
		System.out.println("a:Not Accessible\nb:Not Accessible\nc:"+c+"\nd:"+d);
	}
}
