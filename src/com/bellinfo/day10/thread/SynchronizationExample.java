package com.bellinfo.day10.thread;

public class SynchronizationExample {

	public static void main(String[] args) {
		int i=Integer.valueOf(99);
		
	
		IncrementOper inc1 = new IncrementOper();
		SynchronizedScenario thread1 = new SynchronizedScenario("java", inc1);
		SynchronizedScenario thread2 = new SynchronizedScenario("SQL", inc1);
	}

}

class SynchronizedScenario implements Runnable {

	String name;
	IncrementOper inc;
	Thread t;

	SynchronizedScenario(String name, IncrementOper inc) {
		this.name = name;
		this.inc = inc;
		t = new Thread(this, name);
		t.start();
	}

	@Override
	public void run() {
		if (name.equals("SQL")) {
			inc.method2(name);
		}
		System.out.println("Thread started :" + t.getName());
		inc.method(name);
		System.out.println("Thread Ended:" + t.getName());

	}

}

class IncrementOper {

	static int a = 1;

	public synchronized void method(String name) {
		synchronized (name) {
			for (int i = 0; i < 4; i++) {
				//method2(name);
				System.out.println("Running Thread name:" + name + " count:"
						+ i);
			}
		}
	}

	public void method2(String name) {
		method(name);
		if (name.equals("SQL")) {
			a++;
			System.out.println("In Method2 :" + name + " c:" + a);
		} else {
			a = a + 1;
			System.out.println("In Method2 :" + name + " c:" + a);
		}
	}
}