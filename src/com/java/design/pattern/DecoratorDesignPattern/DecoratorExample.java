package com.java.design.pattern.DecoratorDesignPattern;

public class DecoratorExample {
	
	public static void main(String arg[]) {
		
		Phone androidPhone = new AndriodPhone(new BasicPhone());
		System.out.println(androidPhone.build());
		
		Phone iphone = new IPhone(new BasicPhone());
		System.out.println(iphone.build());
	}

}
