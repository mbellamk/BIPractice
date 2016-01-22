package com.bellinfo.assignments.assignment3;

public class InterfaceAndAbstractClassExample {

	final static Nexus5 nexus5 = new Nexus5();

	public static void main(String args[]) {

		Nexus5 nexus = new Nexus5();
		Iphone5 i5 = new Iphone5();
		Iphone6S i6s = new Iphone6S();
		nexus5.setBatteryLife(500);
		System.out.println(nexus5.getBatteryLife());
	}
}

interface Phone {

	void pickUpCall();

	void rejectCall();

	void dialNumber();

	void installApps();

	void display();
}

abstract class AndroidPhone implements Phone {

	@Override
	public void dialNumber() {
		System.out.println("Click on the phone icon and dial Number");

	}

	public void pickUpCall() {
		System.out.println("Swipe Right to pickup the call");
	}

	public void rejectCall() {
		System.out.println("Swipe Left to reject the call");
	}

	@Override
	public void installApps() {
		System.out.println("Open PlayStore and select the applicaiton");
	}
}

abstract class IPhone implements Phone {

	public void pickUpCall() {
		System.out.println("Press Green button to pick up call");
	}

	public void rejectCall() {
		System.out.println("Press Red button to reject the call");
	}

	@Override
	public void dialNumber() {

		System.out
				.println("click on the phone icon and go to keypad and dial Number");

	}

	@Override
	public void installApps() {

		System.out
				.println("Open the AppStore and search for the desired applicationa and install it");
	}
}

class Nexus5 extends AndroidPhone {

	int batteryLife = 600;

	public void display() {
		System.out.println("Display with pixels 1920*1080");
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

}

class LGPhone extends AndroidPhone {
	public void pickUpCall() {
		System.out.println("Swipe left to pickup the call");
	}

	public void rejectCall() {
		System.out.println("Swipe Right to reject the call");
	}

	public void display() {
		System.out.println("Display with pixels 1720*1080");
	}
}

class Iphone5 extends IPhone {

	int batteryLife = 800;

	public void display() {
		System.out.println("Display in screen size 640*1136");
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

}

class Iphone6S extends IPhone {

	int battteryLife = 1000;

	public void display() {
		System.out.println("Display with screen size 640*1300");
	}

	void fingerPrintScanner() {
		System.out
				.println("Plece your thumb on Home button to unlock your screen");
	}

	public int getBattteryLife() {
		return battteryLife;
	}

	public void setBattteryLife(int battteryLife) {
		this.battteryLife = battteryLife;
	}

}