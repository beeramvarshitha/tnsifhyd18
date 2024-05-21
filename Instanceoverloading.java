package com.in.path;


	 class Base {
		  void C() {
			  System.out.println("no parameters");
		  }
		  void D(int a) {
			  System.out.println("one  int parameter");
		  }
		  void E(int a,int b) {
			  System.out.println("two parameters");
		  }
		  }


	public class Instanceoverloading {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Base b1=new Base();
	     b1.C();
	     b1.D(16);
	     b1.E(17,18);
	     
		
		
		
		}
	}


