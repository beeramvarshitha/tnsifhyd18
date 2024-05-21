package com.in.path;

public class MainClass {
     int a=10;
     static String b="java";
     int sample1() {
    	 return 11;
     }
     static void sample2() {
    	 System.out.println("python");
     }
     
     public static void main(String[] args) {
		// TODO Auto-generated method stub

    	 MainClass m1=new MainClass();
    	 System.out.println(m1.a);
    	 System.out.println(m1.sample1()) ;
    	 System.out.println(MainClass.b);
    	 MainClass.sample2();
    	 
    	 
	}

}
