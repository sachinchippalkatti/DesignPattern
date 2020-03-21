package com.java.design.pattern.abstractfactorypattern;

public class TestAbstractFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory.getFactory(CalType.NORMAL).create("add").calculate(1, 1);;
		AbstractFactory.getFactory(CalType.SCIENTIFIC).create("square").calculate(11, 11);;
	}

}
