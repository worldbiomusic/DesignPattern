package com.worldbiomusic.designpatten.factory;

import com.worldbiomusic.designpatten.factory.pizza.ChicagoPizzaStore;
import com.worldbiomusic.designpatten.factory.pizza.NewYorkPizzaStore;
import com.worldbiomusic.designpatten.factory.pizza.Pizza;

public class Main {
	public static void main(String[] args) {
		// NewYork 피자
		NewYorkPizzaStore nyStore = new NewYorkPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println(pizza);

		System.out.println("--------------");
		// Chicago 피자
		ChicagoPizzaStore chStore = new ChicagoPizzaStore();
		Pizza pizza2 = chStore.orderPizza("clam");
		System.out.println(pizza2);
	}
}
