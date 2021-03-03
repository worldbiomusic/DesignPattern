package com.worldbiomusic.designpatten.decorator.starbuz.beverage;

import com.worldbiomusic.designpatten.decorator.starbuz.Beverage;

public class Latte extends Beverage{

	public Latte() {
		this.description = "Latte";
	}
	@Override
	public int cost() {
		return 4000;
	}

}
