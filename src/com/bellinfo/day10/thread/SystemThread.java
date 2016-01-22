package com.bellinfo.day10.thread;

public class SystemThread {

	public static void main(String rgs[]) {

		/*
		 * Thread t1 = new Thread(); t1.setName("Java"); Thread t2 = new
		 * Thread(); t2.setName("SQL");
		 * 
		 * for (int i = 0; i <= 10; i++) { System.out.println(t1.getName()); try
		 * { t1.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * System.out.println(t2.getName()); }
		 */

		new MyThread1("java");
		new MyThread1("sql");

	}
}

class MyThread1 extends Thread {

	static int a = 10;
	String name;

	MyThread1(String name) {
		setName(name);
		start();
		
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			a++;
			System.out.println(getName() + " " + a);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}