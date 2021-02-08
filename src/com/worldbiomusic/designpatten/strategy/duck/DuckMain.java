package com.worldbiomusic.designpatten.strategy.duck;

public class DuckMain {
	public static void main(String[] args) {
		Duck m = new MallardDuck("mal1");
		m.display();
		m.swim();
		m.fly();
		m.quack();
		
		Duck m2 = new ModelDuck("modelD");
		m2.display();
		m2.swim();
		m2.fly();
		m2.quack();
		
		System.out.println("===change m2's fly behavior===");
		m2.setFlyBehavior(new FlyWithFart());
		m2.fly();
	}
}
