package com.java.design.pattern.factorypattern;

import java.util.Scanner;

public class CalculateFactory {

	public Calculator getCalculator(String opt) {
		
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
