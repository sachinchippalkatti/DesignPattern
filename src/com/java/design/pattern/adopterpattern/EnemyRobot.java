package com.java.design.pattern.adopterpattern;

public class EnemyRobot {
	
	public void hasHand() {
		System.out.println("Enemy robot can attack with hand");
	}
	
	public void walkForward() {
		System.out.println("Enemy robot can move forward");
	}
	
	public void assignDriver(String name) {
		System.out.println("Robot is assigned to driver"+ name);
	}

}
