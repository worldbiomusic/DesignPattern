package com.worldbiomusic.designpatten.factory.pizza;

public class NewYorkPizzaStore extends PizzaStore {

	public NewYorkPizzaStore() {
		super(new NewYorkPizzaIngredientFactory());
	}

	@Override
	protected Pizza createPizza(String pizza) {
		switch (pizza) {
		case "cheese":
			return new CheesePizza(this.ingredientFactory, "NewYorkCheesePizza");
		case "clam":
			return new ClamPizza(this.ingredientFactory, "NewYorkClamPizza");
		default:
			return null;
		}
	}

}
