package com.java.design.pattern.factorypattern;


public class CalculateFactory {

	public static Calculator getCalculator(String opt) {
		
		Calculator c;
		
		if(opt.equals("add")) {
			c= new Add();
		}else if(opt.equals("sub")) {
			c= new Sub();
		}else {
			c = new Divide();			
		}
		
		return c;
	}
}
