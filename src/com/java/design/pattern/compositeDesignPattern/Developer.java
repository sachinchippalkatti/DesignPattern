package com.java.design.pattern.compositeDesignPattern;

public class Developer extends Employee {

	public Developer(String name, Integer empId, Long salary) {
		super(name, empId, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder("Developer: ");
		builder.append(" ");
		builder.append(name);
		builder.append(" , ");
		builder.append(empId);
		return builder.toString();
	}

}
