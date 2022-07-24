package com.tns.core;

class Mythread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child");
		}

	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Mythread m = new Mythread();
		m.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main");
		}
	}

}
