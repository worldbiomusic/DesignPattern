package com.worldbiomusic.designpatten.factory.pizza;

import com.worldbiomusic.designpatten.factory.pizza.ingredient.BlackOlive;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.FrozenClam;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.Garlic;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.MozzarellaCheese;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.PlumTomatoSauce;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.ThickCrustDough;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Cheese;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Clam;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Dough;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Pepperoni;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Sauce;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Clam createClam() {
		return new FrozenClam();
	}

	@Override
	public Pepperoni createPerreroni() {
		return new BlackOlive();
	}

	@Override
	public Veggies[] createVeggies() {
		return new Veggies[] { new Garlic() };
	}

}
