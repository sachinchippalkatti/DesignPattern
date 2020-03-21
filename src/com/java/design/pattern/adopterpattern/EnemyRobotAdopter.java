package com.java.design.pattern.adopterpattern;

public class EnemyRobotAdopter implements EnemyAttacker{
	
	EnemyRobot newRobot;
	
	EnemyRobotAdopter(EnemyRobot robot){
		newRobot = robot;
	}

	@Override
	public void fireWeapon() {
		newRobot.hasHand();
		
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		newRobot.walkForward();
		
	}

	@Override
	public void assignDriver(String name) {
		// TODO Auto-generated method stub
		newRobot.assignDriver(name);
	}

}
