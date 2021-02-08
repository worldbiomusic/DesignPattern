package com.worldbiomusic.designpatten.strategy.duck;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("can not fly");
	}

}
