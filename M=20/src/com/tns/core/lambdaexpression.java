package com.tns.core;

interface Anonymous
{
	void show();
}

public class lambdaexpression {

	public static void main(String[] args) {
		Anonymous l=() -> 
		{
			System.out.println("Lambda Demo for simplification");
		};
		l.show();

	}

}
