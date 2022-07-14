package pl.krzysztof.Decorator;


import pl.krzysztof.Factory.Pizza;

public abstract class ToppingsDecorator extends Pizza {
	
	public abstract String getDescription();
	
	public abstract double getCost();

}
