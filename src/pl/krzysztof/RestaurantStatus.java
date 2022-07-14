package pl.krzysztof;

import pl.krzysztof.Factory.Pizza;

import java.util.HashMap;

public class RestaurantStatus {
    private static final HashMap<Integer, Pizza> pizzas = new HashMap<>();
    public static final int FIRST_PIZZA = 0;
    public static final int NEXT_VALUE = 1;

    private static RestaurantStatus restaurantStatus;

    private RestaurantStatus() {
    }

    public static RestaurantStatus getInstance() {
        if (restaurantStatus == null) {
            restaurantStatus = new RestaurantStatus();
        }
        return restaurantStatus;
    }

    private static int getId(){
        if(pizzas.isEmpty()){
            return FIRST_PIZZA;
        }
        return pizzas.keySet()
                .stream()
                .max(Integer::compareTo)
                .get()+ NEXT_VALUE;
    }

    public void addPizza(Pizza pizza){
        pizzas.put(getId(), pizza);
    }

    public void printAll(){
        pizzas.forEach((key, value) -> System.out.println("Pizza z id: " + key + " -> " + value));
    }

    public void changeStatus(int pizzaId){
        Pizza pizza = pizzas.get(pizzaId);
        if(pizza == null){
            System.out.println("NIE MA TAKIEJ PIZZY!");
        }else{
            pizzas.get(pizzaId).getState().next();
        }

    }
}
