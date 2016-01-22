package com.bellinfo.assignments.assignment8.threads;

public class SynchronizationExample {

	public static void main(String[] args) {
		int i = Integer.valueOf(99);

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

		System.out.println("Thread started :" + t.getName());
		inc.method(name, t);
		System.out.println("Thread Ended:" + t.getName());

	}

}

class IncrementOper {

	static int a = 1;

	public void method(String name, Thread t) {

		synchronized (t) {
			if (name.equals("java")) {
				try {
					t.wait(5000);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (int i = 0; i < 4; i++) {
				System.out.println("Running Thread name:" + name + " count:"
						+ i);

			}

			if (name.equals("SQL")) {
				notifyAll();
			}

		}
	}

}