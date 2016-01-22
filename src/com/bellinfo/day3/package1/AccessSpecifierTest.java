package com.bellinfo.day3.package1;

import com.bellinfo.day3.package2.D;
import com.bellinfo.day3.package2.E;
import com.bellinfo.day3.package2.F;

public class AccessSpecifierTest {

	public static void main(String[] args) {
		
		A a=new A();
		a.aMethod1();
		B b=new B();
		b.bMethod1();
		C c=new C();
		c.cMethod1();
		D d=new D();
		d.dMethod1();
		E e=new E();
		e.eMethod1();
		F f=new F();
		f.fMethod1();
	}
	
	public void method1(){
		//String n=name;
	}

}
