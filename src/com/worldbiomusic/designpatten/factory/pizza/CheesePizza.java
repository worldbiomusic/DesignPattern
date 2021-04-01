package com.worldbiomusic.designpatten.factory.pizza;

public class CheesePizza extends Pizza {

	public CheesePizza(PizzaIngredientFactory ingredienetFactory, String name) {
		super(ingredienetFactory, name);
	}

	@Override
	public void prepare() {
		this.ingredients.setDough(this.ingredienetFactory.createDough());
		this.ingredients.setSauce(this.ingredienetFactory.createSauce());
		this.ingredients.setCheese(this.ingredienetFactory.createCheese());
	}

}
