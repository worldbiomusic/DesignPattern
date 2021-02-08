package com.worldbiomusic.designpatten.strategy.duck;

public class ModelDuck extends Duck{

	public ModelDuck(String name) {
		super(name);
		this.setFlyBehavior(new FlyNoWay());
		this.setQuackBahavior(new Squeak());
	}

	@Override
	public void display() {
		System.out.println("I'm Model Duck");
	}
}
