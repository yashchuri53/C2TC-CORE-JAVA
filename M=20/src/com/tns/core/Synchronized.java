package com.tns.core;

class Counter1 {
	int count;

	public synchronized void inc() {
		count++;
	}
}

public class Synchronized {

	public static void main(String[] args) {
		Counter C = new Counter();
		C.inc();
		System.out.println(C.count);

	}

}
