package com.worldbiomusic.designpatten.strategy.duck;

public class MuteQuack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("<MUTE>");
	}
}
