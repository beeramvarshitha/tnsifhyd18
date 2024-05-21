package com.in.path;


	  class Parent {
		   void A() {
			   
		   System.out.println("parent class content");
		}
	   }
	   class Child extends Parent {
		   void A() {
			   System.out.println("child class content");
	  
		   }
	   }
	   
	public class Instanceoverriding {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      Parent p1=new Child();
	      p1.A();
		}

	}


