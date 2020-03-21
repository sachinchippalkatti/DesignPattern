package com.java.design.pattern.DecoratorDesignPattern;

public class IPhone extends SmartPhone {

	public IPhone(Phone basicPhone) {
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
		return " IOS v13.0.3";
	}
}
