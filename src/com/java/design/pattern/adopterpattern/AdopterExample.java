package com.java.design.pattern.adopterpattern;

public class AdopterExample {
	public static void main(String arg[]) {
		AndriodCharger andriodCharger = new AndriodCharger();
		AndroidPhone oneplus = new OnePlus5();
		andriodCharger.charger(oneplus);
		
		IPhoneCharger iPhoneCharger = new IPhoneCharger();
		IPhone iPhone = new IPhoneX();
		iPhoneCharger.charger(iPhone);
		
		
		AndroidPhoneWithIPhoneChargerAdopter androidPhoneWithIPhoneChargerAdopter = new AndroidPhoneWithIPhoneChargerAdopter(oneplus);
		androidPhoneWithIPhoneChargerAdopter.changer();
	}
}
