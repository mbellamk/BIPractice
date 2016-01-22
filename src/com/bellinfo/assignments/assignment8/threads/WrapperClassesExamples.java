package com.bellinfo.assignments.assignment8.threads;

public class WrapperClassesExamples {

	public static void main(String args[]) {
		byte b = 0;
		short s = 1;
		int i = 1;
		long l = 1;
		float f = 10.0f;
		double d = 10.0;
		char c = 'c';
		boolean bool = false;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);

		Byte bObj = new Byte(b);
		Integer iObj = new Integer(i);
		Short sObj = new Short(s);
		Long lObj = new Long(l);
		Float fObj = new Float(f);
		Double dObj = new Double(d);
		Character cObj = new Character(c);
		Boolean boolObj = new Boolean(bool);

		System.out.println(bObj);
		System.out.println(sObj);
		System.out.println(iObj);
		System.out.println(lObj);
		System.out.println(fObj);
		System.out.println(dObj);
		System.out.println(cObj);
		System.out.println(boolObj);

		byte bb = bObj.byteValue();
		short ss = sObj.shortValue();
		int ii = iObj.intValue();
		long ll = lObj.longValue();
		float ff = fObj.floatValue();
		double dd = dObj.doubleValue();
		char cc = cObj.charValue();
		boolean boolb = boolObj.booleanValue();

		System.out.println(bb);
		System.out.println(ss);
		System.out.println(ii);
		System.out.println(ll);
		System.out.println(ff);
		System.out.println(dd);
		System.out.println(cc);
		System.out.println(boolb);
	}
}
