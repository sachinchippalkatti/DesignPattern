package com.java.design.pattern.DecoratorDesignPattern;

public class AndriodPhone extends SmartPhone {

	public AndriodPhone(Phone basicPhone) {
		super(basicPhone);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String build() {
		// TODO Auto-generated method stub
		return basicPhone.build() + addOs();
	}

	private String addOs() {
		// TODO Auto-generated method stub
		return "Andriod OS v9.0.9";
	}

}
