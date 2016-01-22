package com.bellinfo.assignments.assignment3;

public class PassByValueOrReference {
	public static void main(String args[]) {

		PassByValue pv=new PassByValue();
		PassByValue pv1=new PassByValue();
		PassByReference pf=new PassByReference(pv);
		pf.passByReferenceMethod1();
		pf.passByReferenceMethod2(pv1);
		System.out.println(pv.a);
		System.out.println(pv1.a);
		int c=8;
		pv.passByValMethod1(c);
		System.out.println(c);
	}
}

class PassByValue{
	
	int a,b;
	
	void passByValMethod1(int c){
		c=5;
	}
}

class PassByReference{
	
	PassByValue pv;
	
	public PassByReference(PassByValue pv) {
		this.pv=pv;
	}
	void passByReferenceMethod1(){
		pv.a=4;
	}
	
	void passByReferenceMethod2(PassByValue pv1){
		pv1.a=7;
	}
	
}
