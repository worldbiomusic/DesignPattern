package com.worldbiomusic.designpatten.factory.pizza;

public abstract class PizzaStore {
	PizzaIngredientFactory ingredientFactory;

	public PizzaStore(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = this.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	protected abstract Pizza createPizza(String pizza);
}
