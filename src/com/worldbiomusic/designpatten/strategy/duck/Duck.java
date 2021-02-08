package com.worldbiomusic.designpatten.strategy.duck;

public abstract class Duck {
	private String name;
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public Duck(String name) {
		this.name = name;
	}
	
	// 모든 오리는 동일하게 수영할 줄 안다고 가정
	public void swim() {
		System.out.println("swim");
	}
	
	// 오리는 각각 다르게 생겼기 떄문
	public abstract void display();
	
	public void fly() {
		this.flyBehavior.fly();
	}
	
	public void quack() {
		this.quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBahavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
