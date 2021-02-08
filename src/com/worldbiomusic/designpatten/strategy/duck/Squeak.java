package com.worldbiomusic.designpatten.strategy.duck;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak");
	}
	
}
