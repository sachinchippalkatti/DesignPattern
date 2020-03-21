package com.java.design.pattern.factorypattern;

import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;

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
		
		obj = CalculateFactory.getCalculator(opt);
		obj.calculate(a, b);
		
		
	}

}
