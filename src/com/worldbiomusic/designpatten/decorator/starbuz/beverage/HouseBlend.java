package com.worldbiomusic.designpatten.decorator.starbuz.beverage;

import com.worldbiomusic.designpatten.decorator.starbuz.Beverage;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		this.description = "HouseBlend";
	}

	@Override
	public int cost() {
		return 5000;
	}


}
