package com.worldbiomusic.designpatten.strategy.duck;

public class FlyWithFart implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("fart flying");
	}
	
}
