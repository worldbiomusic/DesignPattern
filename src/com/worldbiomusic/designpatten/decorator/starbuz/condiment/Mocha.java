package com.worldbiomusic.designpatten.decorator.starbuz.condiment;

import com.worldbiomusic.designpatten.decorator.starbuz.Beverage;
import com.worldbiomusic.designpatten.decorator.starbuz.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}

	@Override
	public int cost() {
		return this.beverage.cost() + 500;
	}

}
