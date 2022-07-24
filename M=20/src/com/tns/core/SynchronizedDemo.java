package com.tns.core;

class Counter {
	int count;

	public synchronized void inc() {
		count++;
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter C = new Counter();
		// first thread
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 10000; i++) {
					C.inc();
				}
			}
		});
		// second thread
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 10000; i++) {
					C.inc();
				}
			}
		});
		// calling start and join methods
		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(C.count);
	}
}