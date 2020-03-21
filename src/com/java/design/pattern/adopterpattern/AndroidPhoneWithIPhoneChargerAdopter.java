package com.java.design.pattern.adopterpattern;

public class AndroidPhoneWithIPhoneChargerAdopter implements IPhone{

	AndroidPhone androidPhone;
	
	AndroidPhoneWithIPhoneChargerAdopter(AndroidPhone androidPhone){
		this.androidPhone = androidPhone;
	}
	
	@Override
	public void changer() {
		// TODO Auto-generated method stub
		androidPhone.changer();
	}

}
