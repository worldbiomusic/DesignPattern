package com.worldbiomusic.designpatten.decorator.starbuz.condiment;

import com.worldbiomusic.designpatten.decorator.starbuz.Beverage;
import com.worldbiomusic.designpatten.decorator.starbuz.CondimentDecorator;

public class Perl extends CondimentDecorator{

	public Perl(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription()+", Perl";
	}

	@Override
	public int cost() {
		return this.beverage.cost() + 1000;
	}

}
