package com.worldbiomusic.designpatten.factory.pizza;

public class ChicagoPizzaStore extends PizzaStore{

	public ChicagoPizzaStore() {
		super(new ChicagoPizzaIngredientFactory());
	}

	@Override
	protected Pizza createPizza(String pizza) {
		switch (pizza) {
		case "cheese":
			return new CheesePizza(this.ingredientFactory, "ChicagoCheesePizza");
		case "clam":
			return new ClamPizza(this.ingredientFactory, "ChicagoClamPizza");
		default:
			return null;
		}
	}

}
