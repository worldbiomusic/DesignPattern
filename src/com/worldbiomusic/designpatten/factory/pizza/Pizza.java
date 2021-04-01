package com.worldbiomusic.designpatten.factory.pizza;

public abstract class Pizza {
	String name;
	Ingredients ingredients;
	PizzaIngredientFactory ingredienetFactory;

	public Pizza(PizzaIngredientFactory ingredienetFactory, String name) {
		this.name = name;
		this.ingredienetFactory = ingredienetFactory;
		this.ingredients = new Ingredients();
	}

	public abstract void prepare();

	public void bake() {
		System.out.println("bake " + this.name + " pizza...");
	}

	public void cut() {
		System.out.println("cut " + this.name + " pizza...");
	}

	public void box() {
		System.out.println("box " + this.name + " pizza...");
	}

	@Override
	public String toString() {
		return "[PizzaInfo]\nName: " + this.name + "\nIngredientFactory: " + this.ingredienetFactory.getClass().getSimpleName()
				+ "\n" + this.ingredients.toString();
	}

}
