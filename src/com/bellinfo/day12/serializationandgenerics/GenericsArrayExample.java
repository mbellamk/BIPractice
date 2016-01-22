package com.bellinfo.day12.serializationandgenerics;

public class GenericsArrayExample {

	public static void main(String args[]) {

		
		
		Bucket<String> stringBucket=new Bucket<>(3);
		stringBucket.add("zero");
		stringBucket.add("one");
		stringBucket.add("two");
		
		System.out.println(stringBucket.get(0));
		System.out.println(stringBucket.get(1));
		System.out.println(stringBucket.get(2));
		
		Bucket<String> floatBucket=new Bucket<>(3);
		floatBucket.add("10.0");
		floatBucket.add("11.0");
		floatBucket.add("12.0");
		
		
		System.out.println(floatBucket.get(0));
		System.out.println(floatBucket.get(1));
		System.out.println(floatBucket.get(2));
	}
}

class Bucket<T> {
	T[] a;
	int index = 0;
	

	Bucket(int size) {
		a = (T[]) new Object[size];
	}

	public T get(int i) {
		
		return a[i];
	}

	public void add(T val) {
		a[index] = val;
		index++;
	}

	public T[] getA() {
		return a;
	}

	public void setA(T[] a) {
		this.a = a;
	}

}
