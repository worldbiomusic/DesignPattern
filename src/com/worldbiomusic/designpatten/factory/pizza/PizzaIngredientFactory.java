package com.worldbiomusic.designpatten.factory.pizza;

import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Cheese;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Clam;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Dough;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Pepperoni;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Sauce;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Clam createClam();
	public Pepperoni createPerreroni();
	public Veggies[] createVeggies();
	
	
}
