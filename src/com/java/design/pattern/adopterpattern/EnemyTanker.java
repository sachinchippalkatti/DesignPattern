package com.java.design.pattern.adopterpattern;

import java.util.Random;

public class EnemyTanker implements EnemyAttacker{
	
	Random random = new Random();

	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		
		System.out.println("damage the fir wappone" + random.nextInt(2));
		
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		
		System.out.println("drive forwad" + random.nextInt(5) );
	}

	@Override
	public void assignDriver(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("assign name to driver" + name);
	}

}
