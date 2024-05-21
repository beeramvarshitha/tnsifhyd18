package com.in.path;

public class Instancemember {
	int A=123;
	static int B=321;
	void display() {

		System.out.println(A);
		System.out.println(B);

	}
	public static void main(String args[]) {
		Instancemember m1=new Instancemember();
		m1.display();
	}
}
