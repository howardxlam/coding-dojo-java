package com.howard.caranddriver;
public class Car {
	
	public int gas = 10;
	
	public void display() {
		System.out.println("Remaining gas: " + gas);
		if (gas <= 0) {
			System.out.println("Game over!");
		}
	}
}
