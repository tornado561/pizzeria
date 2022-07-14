package pl.krzysztof.Toppings;

import pl.krzysztof.Decorator.ToppingsDecorator;
import pl.krzysztof.Factory.Pizza;

public class Olives extends ToppingsDecorator{
	
	private final Pizza pizza;

	public Olives(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "Oliwki, ";
	}

	@Override
	public double getCost() {
		return 1.50 + pizza.getCost();
	}

	

}
