package com.java.design.pattern.compositeDesignPattern;

public abstract class Employee {
	protected String name;
	protected Integer empId;
	protected Long salary;
	
	public Employee(String name, Integer empId, Long salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	public abstract String toString();	

	public void add(Employee employee) {
	
	}
	
	public void remove(Employee employee) {
		
	}
}
