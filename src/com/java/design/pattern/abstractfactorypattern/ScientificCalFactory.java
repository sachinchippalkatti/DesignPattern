package com.java.design.pattern.abstractfactorypattern;

public class ScientificCalFactory implements CalFactory {

	@Override
	public Calculator create(String type) {
		// TODO Auto-generated method stub
		switch (type) {
		case "square":
			return new SquareRoot();
		default:
			return null;
		}
	}

}
