package com.java.design.pattern.singleton;

import java.util.Calendar;

class SingletonClass {
	private static volatile SingletonClass soleInstance = null;
	
	private SingletonClass() {
		
	}
	
	public static synchronized SingletonClass getInstance() {
		if(soleInstance == null) { // single check 
			synchronized(SingletonClass.class) {
				if(soleInstance == null) // double check
				soleInstance = new SingletonClass();
			}
		}
			
		return soleInstance;
	}
	
}

public class Singleton{
	
	public static void main(String args[]) {
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		//SingletonClass s3 = new SingletonClass();
		
		print("S1", s1);
		print("S2", s2);
		//print("s3", s3);
		
	}

	private static void print(String string, SingletonClass s2) {
		// TODO Auto-generated method stub
		System.out.println("Hash code of " + string + " : " +s2.hashCode());
	}
}
