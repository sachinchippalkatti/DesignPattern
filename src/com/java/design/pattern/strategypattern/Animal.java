package com.java.design.pattern.strategypattern;

public class Animal {
	
	private String name;
	private int weight;
	private String sound;
	private Fly fly;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight > 0) {
		this.weight = weight;
		}else {
			System.out.println("weight must be greater than zero");
		}	
	}
	
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public Fly getFly() {
		return fly;
	}
	public void setFly(Fly fly) {
		this.fly = fly;
	}
	
	

}
