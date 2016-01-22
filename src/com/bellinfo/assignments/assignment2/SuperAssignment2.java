package com.bellinfo.assignments.assignment2;

public class SuperAssignment2 {

	public static void main(String args[]){
	ABC abc=new ABC(4,8,2,7);
	}
}


class XYZ{
	
	int a,b;
	
	XYZ(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("From Class ABC");
		System.out.println("a="+a+"\nB="+b);
	}
}

class DEF extends XYZ{
	int c,d;
	
	DEF(int a, int b,int c,int d)
	{
		super(a,b);
		this.c=c;
		this.d=d;
		System.out.println("From Class DEF");
		System.out.println("c="+c+"\nD="+d);
	}
}

class ABC extends DEF{
	
	ABC(int a,int b, int c, int d){
		super(a,b,c,d);
	}
}