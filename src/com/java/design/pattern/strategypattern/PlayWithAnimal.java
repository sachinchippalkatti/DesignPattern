package com.java.design.pattern.strategypattern;

public class PlayWithAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Dog();
		Animal bird = new Birds();
		dog.setWeight(-1);
		System.out.println("Dog :" + dog.getSound() + dog.getFly().flymessage());
		System.out.println("Birds :" + bird.getSound() + bird.getFly().flymessage());	
	}

}
