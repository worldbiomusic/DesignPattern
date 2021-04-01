package com.worldbiomusic.designpatten.factory.pizza;

import com.worldbiomusic.designpatten.factory.pizza.ingredient.FreshClam;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.Garlic;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.MarinaraSauce;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.MushRoom;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.Onion;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.RedPepper;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.ReggianoCheese;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.SlicedPepperoni;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.ThinCrustDough;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Cheese;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Clam;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Dough;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Pepperoni;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Sauce;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Veggies;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Clam createClam() {
		return new FreshClam();
	}

	@Override
	public Pepperoni createPerreroni() {
		return new SlicedPepperoni();
	}

	@Override
	public Veggies[] createVeggies() {
		return new Veggies[] { new Garlic(), new Onion(), new MushRoom(), new RedPepper() };
	}

}
