package com.worldbiomusic.designpatten.factory.pizza;

import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Cheese;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Clam;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Dough;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Pepperoni;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Sauce;
import com.worldbiomusic.designpatten.factory.pizza.ingredient.interfaces.Veggies;

public class Ingredients {
	Dough dough;
	Cheese cheese;
	Sauce sauce;
	Clam clam;
	Veggies[] veggies;
	Pepperoni pepperoni;

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Clam getClam() {
		return clam;
	}

	public void setClam(Clam clam) {
		this.clam = clam;
	}

	public Veggies[] getVeggies() {
		return veggies;
	}

	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}

	public Pepperoni getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	public String getIngredientsList() {
		// 재료 목록을 String값으로 리턴
		String doughStr = dough == null ? null : dough.getClass().getSimpleName();
		String cheeseStr = cheese == null ? null : cheese.getClass().getSimpleName();
		String sauceStr = sauce == null ? null : sauce.getClass().getSimpleName();
		String clamStr = clam == null ? null : clam.getClass().getSimpleName();
		String veggiesStr = "";
		if (this.veggies != null) {
			for (Veggies v : this.veggies) {
				if (v != null)
					veggiesStr += v.getClass().getSimpleName();
			}
		}
		String pepperoniStr = pepperoni == null ? null : pepperoni.getClass().getSimpleName();
		return doughStr + ", " + cheeseStr + ", " + sauceStr + ", " + clamStr + ", " + veggiesStr + ", " + pepperoniStr;
	}

	@Override
	public String toString() {
		return "Ingredients: [" + this.getIngredientsList() + "]";
	}

}
