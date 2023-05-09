package com.howard.caranddriver;

public class Driver extends Car {
	
	public void drive() {
		gas -= 1;
		System.out.println("Driving the car. Gas used: 1");
		display();
	}
	
	public void boosters() {
		if (gas < 3) {
			System.out.println("Not enough gas to use boosters.");
		} else {
		gas -= 3;
		System.out.println("Using boosters. Gas used: 3");
		}
		display();
		
	}
	
	public void refuel() {
		if (gas > 8) {
			System.out.println("Tank cannot handle another refuel.");
		} else {
		gas += 2;
		System.out.println("Refueling the car. Gas refueled: 2");
		}
		display();
	}
}
