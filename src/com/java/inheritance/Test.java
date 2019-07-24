package com.java.inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A();
		System.out.println(obj1.methodA());
		
		
		B obj2 = new B();
		System.out.println(obj2.methodB());
		System.out.println(obj2.methodA());
		
		// Supper class reference  with subclass object creation with new can be -- DONE
		A obj3 = new B();
		System.out.println(obj3.methodA()); // reference variable is of type A class its have feature of A, but object B is created
	
		
		
		A w = new Work();
		w.name = "sachin";
		((Work)w).email = "sachin@gmail.com";
		
		System.out.println(w);
		
		A friend = new B();
		friend.name="anish";
		((B)friend).phone= "893884848";
		
		System.out.println(friend);
		
		
		
		
		
		
	}

}
