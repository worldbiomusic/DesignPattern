package com.worldbiomusic.designpatten.decorator.starbuz;

public abstract class Beverage {
	protected String description;
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract int cost();
}
