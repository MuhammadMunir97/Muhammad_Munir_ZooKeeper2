package com.mammal;

public class Bat extends mammal{
	Bat(){
		energyLevel = 300;
	}
	public void fly(){
		System.out.println("cheuf cheuf cheuf");
		energyLevel -= 50;
	}
	public void eatHumans(){
		System.out.println("so- well never mind");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("sound of a town on fire");
		energyLevel -= 100;
	}
}
