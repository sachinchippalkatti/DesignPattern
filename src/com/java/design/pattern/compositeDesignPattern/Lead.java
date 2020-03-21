package com.java.design.pattern.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Lead extends Employee {

	List<Employee> developer = new ArrayList<>();
	
	public Lead(String name, Integer empId, Long salary) {
		super(name, empId, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void add(Employee employee) {
		developer.add(employee);
	}
	
	@Override
	public void remove(Employee employee) {
		developer.remove(employee);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder("Lead: ");
		builder.append(" ");
		builder.append(name);
		builder.append(" , ");
		builder.append(empId);
		builder.append("    Developer List:" + "--------------");
		developer.forEach(
			employee -> builder.append(employee.toString())
		);
		return builder.toString();
	}

}
