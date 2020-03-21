package com.java.design.pattern.DecoratorDesignPattern;

//Decorator
public abstract class SmartPhone implements Phone {
	
	Phone basicPhone;
	
	public SmartPhone(Phone basicPhone) {
		this.basicPhone=basicPhone;
	}
	
	@Override
	public String build() {
		// TODO Auto-generated method stub
		return basicPhone.build();
	}

}
