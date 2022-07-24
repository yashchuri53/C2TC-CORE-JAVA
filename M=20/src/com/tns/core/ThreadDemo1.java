package com.tns.core;

class ChildThread extends Thread // thread
{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I am a child thread");
			Thread.yield(); // passes the chance of execution to the main thread class
		}
	}
}

//thread scheduler
public class ThreadDemo1 {

	public static void main(String[] args) {
		// create an object for ChildThread class
		ChildThread t = new ChildThread();
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("I am Main Thread");
		}

	}
}


