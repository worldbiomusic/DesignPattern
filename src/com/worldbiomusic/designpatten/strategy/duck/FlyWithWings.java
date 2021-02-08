package com.worldbiomusic.designpatten.strategy.duck;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("fly with wings");
	}
}
