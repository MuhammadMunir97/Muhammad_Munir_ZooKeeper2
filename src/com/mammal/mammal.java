package com.mammal;

public class mammal {
	protected int energyLevel = 100 ;
	public int displayEnergy() {
		System.out.println("The current energy level is: " + energyLevel);
		return energyLevel;
	}
}
