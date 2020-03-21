package com.java.design.pattern.adopterpattern;

public class WorkingWithRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnemyTanker tanker = new EnemyTanker();
		
		EnemyRobot robot = new EnemyRobot();
		
		EnemyRobotAdopter robotadopter = new EnemyRobotAdopter(robot);
		
		
		tanker.fireWeapon();
		tanker.driveForward();
		tanker.assignDriver("sachin");
		
		robot.hasHand();
		robot.walkForward();
		robot.assignDriver("anish");

		robotadopter.fireWeapon();
		robotadopter.driveForward();
		robotadopter.assignDriver("anand");
	}

}
