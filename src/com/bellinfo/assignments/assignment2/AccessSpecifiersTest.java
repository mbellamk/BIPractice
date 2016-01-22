package com.bellinfo.assignments.assignment2;

public class AccessSpecifiersTest {

	final privateClass cObj=new privateClass();
	public int a;
	private int b;
	protected int c;
	int d;
	final int e=1;
	transient int f;
	volatile int g;
	static int h;
	float f1=1.23F;
	
	
	//synchronized int h;
	//abstract int h;
	
	public static void main(String args[])
	{
		char ch='\u2345';
		
		System.out.println(ch);
		//System.out.println(cObj.pa);
	}
	
	public void publicMethod()
	{
		/*public int a1;
		private int b1;
		protected int c1;
		
		transient int f1;
		volatile int g1;
		static int h;*/
		
		int d1;
		final int e1=1;
	}
	
	private void privateMethod()
	{
		
	}
	
	protected void protectedMethod()
	{
		
	}
	
	void defaultMethod()
	{
		
	}
	
	static void staticMethod()
	{
		
	}
	
	/*transient void transientMethod(){
		
	}*/
	
	/*volatile void volatileMethod()
	{
		
	}*/
	
	synchronized void synchronizedMethod(){
		
	}
	
	//abstract void abstractMethod();

	private class privateClass{
		
		int pa=1;
		int pb=2;
	}
	
	protected class protectedClass{
		
	}

	static class staticClass{
		
	}
	
	/*transient class transientClass{
		
	}*/

	
	/*volatile class volatileClass{
		
	}*/
	/*synchronized class synchronizedClass{
		
	}*/
}


abstract class abstractClass{
	
}

final class finalClass{
	
}


