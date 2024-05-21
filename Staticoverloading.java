package com.in.path;

class One {
	static void Base() {
	 System.out.println("no parameter");
}
}

class Two {
	static void Base(int a) {
		 System.out.println("int parameter");
}
}
	class Three {
   	static void Base(float a) {
   		 
   	 
   	 System.out.println("float parameter");
    }
}

public class Staticoverloading {

public static void main(String[] args) {
	// TODO Auto-generated method stub
One.Base();
Two.Base(10);
Three.Base(12.3f);
}
}

