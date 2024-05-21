package com.in.path;


class A {
	static void Base() {
		 
	 
	 System.out.println("class A content");
 }
 }
 
 class B extends A {
	static void Base() {
		 
	 
	 System.out.println("class A content");
 }
 }


public class Staticoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new B();
	     a1.Base();

	}

}
