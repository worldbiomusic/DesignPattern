package com.worldbiomusic.designpatten.strategy.duck;

public class MallardDuck extends Duck{

	public MallardDuck(String name) {
		super(name);
		this.setFlyBehavior(new FlyWithWings());
		this.setQuackBahavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("I'm Mallard Duck");
	}

}
