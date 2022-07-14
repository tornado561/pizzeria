package pl.krzysztof;

import pl.krzysztof.Factory.Pizza;
import pl.krzysztof.Pizza.FamilySizePizza;
import pl.krzysztof.Pizza.LargeSizePizza;
import pl.krzysztof.Pizza.MediumSizePizza;
import pl.krzysztof.Pizza.SmallSizePizza;
import pl.krzysztof.Toppings.*;

public class Store {
    private static Store store;

    private Store() {
    }

    public static Store getInstance() {
        if (store == null) {
            store = new Store();
        }
        return store;
    }

    public Pizza orderPizza(String type, Pizza pizza) {
        pizza = createPizza(type, pizza);
        return pizza;
    }

    protected Pizza createPizza(String item, Pizza pizza) {
        switch (item) {
            case "small" -> pizza = new SmallSizePizza();
            case "medium" -> pizza = new MediumSizePizza();
            case "large" -> pizza = new LargeSizePizza();
            case "family" -> pizza = new FamilySizePizza();
            case "Cheese" -> pizza = new Cheese(pizza);
            case "Pepperoni" -> pizza = new Pepperoni(pizza);
            case "Fish" -> pizza = new Fish(pizza);
            case "Bacon" -> pizza = new Bacon(pizza);
            case "Onions" -> pizza = new Onions(pizza);
            case "Olives" -> pizza = new Olives(pizza);
            case "Mushrooms" -> pizza = new Mushrooms(pizza);
            case "Ananas" -> pizza = new Ananas(pizza);
            case "Sausage" -> pizza = new Sausage(pizza);
        }
        return pizza;
    }

}


