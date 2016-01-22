package com.bellinfo.assignments.assignment8.threads;

public class ThreadFunctions extends Thread {
	public ThreadFunctions(String string) {
		setName(string);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Name:" + getName() + ", " + i);
		}
	}

	public static void main(String args[]) {
		ThreadFunctions t1 = new ThreadFunctions("one");
		ThreadFunctions t2 = new ThreadFunctions("two");
		ThreadFunctions t3 = new ThreadFunctions("three");
		t1.start();
		//t1.setPriority(Thread.MIN_PRIORITY);
		t1.setDaemon(true);
		try {
			t1.join();
			//t1.join(5000);
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.start();
		t3.setPriority(Thread.NORM_PRIORITY);
	}
}
