package com.tns.core;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {

		int age;
		System.out.println("Enter Age");
		Scanner sc = new Scanner(System.in);

		age = sc.nextInt();

		if (age > 18) {
			System.out.println("You can Apply for Pancard and Voter ID");
		} else {
			throw new CantApply("You cannot Apply | age is less than 18");
		}

	}

	static class CantApply extends RuntimeException // unchecked Exception
	{

		public CantApply(String msg) // print stack trace method.
		{
			super(msg);

		}

	}
}