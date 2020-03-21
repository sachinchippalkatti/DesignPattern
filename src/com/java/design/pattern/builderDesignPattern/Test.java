package com.java.design.pattern.builderDesignPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone.Builder builder = new Phone.Builder()
				.backPanel("Sand Panel")
				.frontPanel("glass finish")
				.processor("SnagDragen")
				.camera("12 MP");
		Phone phone = builder.build();
		
		System.out.println(phone);
	}

}
