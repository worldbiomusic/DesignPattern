package com.worldbiomusic.designpatten.decorator.starbuz.condiment;

import com.worldbiomusic.designpatten.decorator.starbuz.Beverage;
import com.worldbiomusic.designpatten.decorator.starbuz.CondimentDecorator;

public class Whip extends CondimentDecorator{
	
	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}

	@Override
	public int cost() {
		return this.beverage.cost() + 1000;
	}

}
