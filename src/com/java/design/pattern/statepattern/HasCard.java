package com.java.design.pattern.statepattern;

public class HasCard implements AtmState{
	
	AtmMachie atmMachine;
	
	public HasCard(AtmMachie newAtmMachine) {
		// TODO Auto-generated constructor stub
		atmMachine=newAtmMachine;
	}

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("You cant add more than one card");
		
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Card Ejected");
		atmMachine.setAtmState(atmMachine.getNoCardstate());
	}

	@Override
	public void insertPin(int pin) {
		// TODO Auto-generated method stub
		if(pin == 1234) {
			System.out.println("Correct Pin");
			atmMachine.correctPinEntered = true;
			atmMachine.setAtmState(atmMachine.getHasPin());
		}else {
			System.out.println("Worng pin");
			atmMachine.correctPinEntered = false;
			atmMachine.setAtmState(atmMachine.getNoCardstate());
			
		}
		
	}

	@Override
	public void requestCash(int cash) {
		// TODO Auto-generated method stub
		System.out.println("Enter the pin first");
	}

}
