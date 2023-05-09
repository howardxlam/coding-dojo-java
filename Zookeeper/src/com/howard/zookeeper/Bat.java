package com.howard.zookeeper;

public class Bat extends Mammal{

	public Bat() {
		super();
		this.energy = 300;
	}
	
	public void fly() {
		energy -= 50;
		System.out.println("Moo!");
	}
	
	public void eatHumans() {
		energy += 25;
	}
	
	public void attackTown() {
		energy -= 100;
		System.out.println("Snap, crackle, pop");
	}
	
	

}
