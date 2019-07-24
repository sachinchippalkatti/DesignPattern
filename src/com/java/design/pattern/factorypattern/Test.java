package com.java.design.pattern.factorypattern;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		Calculator obj;
		
		System.out.println("Enter the value of a and b");
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		
		System.out.println("Enter operation to be performed");
		String opt= keyboard.next();
		
		CalculateFactory factory = new CalculateFactory();
		obj = factory.getCalculator(opt);
		obj.calculate(a, b);
	}

}
