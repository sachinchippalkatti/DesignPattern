package com.java.design.pattern.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

	List<Employee> report = new ArrayList<>();
	
	public Manager(String name, Integer empId, Long salary) {
		super(name, empId, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void add(Employee employee) {
		report.add(employee);
	}
	
	@Override
	public void remove(Employee employee) {
		report.remove(employee);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder("Manager: ");
		builder.append(" ");
		builder.append(name);
		builder.append(" , ");
		builder.append(empId);
		builder.append("    Developer List:" + "--------------");
		report.forEach(
			employee -> builder.append(employee.toString())
		);
		return builder.toString();
	}

}
