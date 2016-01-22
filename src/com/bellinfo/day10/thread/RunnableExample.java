package com.bellinfo.day10.thread;

public class RunnableExample {

	public static void main(String[] args) {
		MyRunnable r=new MyRunnable("Java");
	/*	try {
			r.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		new MyRunnable("SQl");
	}

}

class MyRunnable implements Runnable {
	int a = 0;
	Thread t;

	public MyRunnable(String name) {
		t = new Thread(this, name);
		t.start();
	}

	@Override
	public void run() {
		method1();
	}
	
	public synchronized void method1(){
	
		for (int i = 0; i < 10; i++) {
			/*if(t.getName().equals("SQL"))
			{
				try {
					t.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
			System.out.println(t.getName() + " " + i + " " + a);
			try {
				//t.sleep(5000);
				//t.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
