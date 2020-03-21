package com.java.design.pattern.statepattern;

public class AtmMachie {

	AtmState atmState;
	
	AtmState hasCard;
	AtmState noCard;
	AtmState hasPin;
	AtmState noCash;
	
	int cashInMachine = 2000;
	boolean correctPinEntered = false;
	
	public AtmMachie() {
		// TODO Auto-generated constructor stub
		hasCard = new HasCard(this);
		noCard = new noCard(this);
		hasPin= new HasPin(this);
		noCash= new NoCash(this);
		
		atmState= noCard;
		
		if(cashInMachine <0) {
			atmState=noCash;
		}
		
	}

	public void setAtmState(AtmState atmState) {
		this.atmState = atmState;
	}

	public void setCashInMachine(int cashInMachine) {
		this.cashInMachine = cashInMachine;
	}
	
	void insertCard() {
		atmState.insertCard();
	}
	
	void ejectCard() {
		atmState.ejectCard();
	}
	
	void insertPin(int pin) {
		atmState.insertPin(pin);
	}
	
	void requestCash(int cash) {
		atmState.requestCash(cash);
	}
	
	public AtmState getYesCardState() { return hasCard;}
	public AtmState getNoCardstate() { return noCard; }
	public AtmState getHasPin() { return hasPin; }
	public AtmState getNoCashState() { return noCash;}
	}
