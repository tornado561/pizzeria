package pl.krzysztof;

import pl.krzysztof.Factory.Pizza;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    Store store = Store.getInstance();
    RestaurantStatus restaurantStatus = RestaurantStatus.getInstance();
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat(".###");

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        int firstChoice = 0;

        while(firstChoice!=9){
            System.out.println("0 - wybrac rodzaj pizzy");
            System.out.println("1 - aby zobaczyc pizze");
            System.out.println("2 - zmienic status pizzy");
            System.out.println("9 - aby wyjsc");
            firstChoice = input.nextInt();
            switch (firstChoice) {
                case 0 -> {
                    Pizza pizza = preparePizza();
                    restaurantStatus.addPizza(pizza);
                }
                case 1 -> restaurantStatus.printAll();
                case 2 -> {
                    System.out.println("Ktora chcesz pizze zmienic (wpisz id):");
                    restaurantStatus.printAll();
                    firstChoice = input.nextInt();
                    restaurantStatus.changeStatus(firstChoice);
                }
                case 9 -> {}
                default -> System.out.println("Zly wybor, sprobuj ponownie: ");
            }
        }


    }

    private Pizza preparePizza() {
        int firstChoice;
        String finalOrder;
        int ingredients = 0;
        double finalCost;

        String choice;
        char secondChoice;

        Pizza orderedPizza = null;

        printMenu();
        firstChoice = input.nextInt();

        switch (firstChoice) {
            case 1 -> orderedPizza = store.orderPizza("small", orderedPizza);
            case 2 -> orderedPizza = store.orderPizza("medium", orderedPizza);
            case 3 -> orderedPizza = store.orderPizza("large", orderedPizza);
            case 4 -> orderedPizza = store.orderPizza("family", orderedPizza);
            default -> {
                System.out.println("Zly wybor, sprobuj ponownie: ");
                System.exit(0);
            }
        }


        do {
            printMenuToppings();
            choice = input.next();
            secondChoice = choice.charAt(0);
            switch (secondChoice) {
                case 'p' -> {
                    orderedPizza = store.orderPizza("Pepperoni", orderedPizza);
                    ingredients = ingredients + 1;
                    finalOrder = countFinalOrder(orderedPizza);
                    finalCost = orderedPizza.getCost();
                    printOrder(finalOrder, finalCost, ingredients);
                }
                case 'k' -> {
                    orderedPizza = store.orderPizza("Sausage", orderedPizza);
                    ingredients = ingredients + 1;
                    finalOrder = countFinalOrder(orderedPizza);
                    finalCost = orderedPizza.getCost();
                    printOrder(finalOrder, finalCost, ingredients);
                }
                case 'r' -> {
                    orderedPizza = store.orderPizza("Fish", orderedPizza);
                    ingredients = ingredients + 1;
                    finalOrder = countFinalOrder(orderedPizza);
                    finalCost = orderedPizza.getCost();
                    printOrder(finalOrder, finalCost, ingredients);
                }
                case 'b' -> {
                    orderedPizza = store.orderPizza("Bacon", orderedPizza);
                    ingredients = ingredients + 1;
                    finalOrder = countFinalOrder(orderedPizza);
                    finalCost = orderedPizza.getCost();
                    printOrder(finalOrder, finalCost, ingredients);
                }
                case 'd' -> {
                    orderedPizza = store.orderPizza("Cheese", orderedPizza);
                    ingredients = ingredients + 1;
                    finalOrder = countFinalOrder(orderedPizza);
                    finalCost = orderedPizza.getCost();
                    printOrder(finalOrder, finalCost, ingredients);
                    ;
                }
                case 'c' -> {
                    orderedPizza = store.orderPizza("Onions", orderedPizza);
                    ingredients = ingredients + 1;
                    finalOrder = countFinalOrder(orderedPizza);
                    finalCost = orderedPizza.getCost();
                    printOrder(finalOrder, finalCost, ingredients);
                }
                case 'o' -> {
                    orderedPizza = store.orderPizza("Olives", orderedPizza);
                    ingredients = ingredients + 1;
                    finalOrder = countFinalOrder(orderedPizza);
                    finalCost = orderedPizza.getCost();
                    printOrder(finalOrder, finalCost, ingredients);
                }
                case 'g' -> {
                    orderedPizza = store.orderPizza("Mushrooms", orderedPizza);
                    ingredients = ingredients + 1;
                    finalOrder = countFinalOrder(orderedPizza);
                    finalCost = orderedPizza.getCost();
                    printOrder(finalOrder, finalCost, ingredients);
                }
                case 'a' -> {
                    orderedPizza = store.orderPizza("Ananas", orderedPizza);
                    ingredients = ingredients + 1;
                    finalOrder = countFinalOrder(orderedPizza);
                    finalCost = orderedPizza.getCost();
                    printOrder(finalOrder, finalCost, ingredients);
                }
                case 'q' -> {
                    return orderedPizza;
                }
                case 'z' -> System.exit(0);
                default -> System.out.println("Zly produkt, sprobuj ponownie: ");
            }

        } while (true);
    }

    private void printMenuToppings() {
        System.out.println("********Lista dodatkow********");
        System.out.println("(p)epperoni, 2.00zl");
        System.out.println("(k)ielabasa, 2.00zl");
        System.out.println("(r)yba, 2.00zl");
        System.out.println("(b)ekon, 2.75zl");
        System.out.println("(d)odatkowy ser, 1.85zl");
        System.out.println("(c)ebula, 1.50zl");
        System.out.println("(o)liwki, 1.50zl");
        System.out.println("(g)rzyby, 1.75zl");
        System.out.println("(a)nanas, Za darmo!");
        System.out.println("Wcisnij 'q' aby zakonczyc zamowienie, 'z' aby anulowac!");
        System.out.println("Wprowadz litere: ");
    }

    private void printMenu() {
        System.out.println("*****************MENU***************");
        System.out.println("1. Mala, 20.00zl");
        System.out.println("2. Srednia, 25.00zl");
        System.out.println("3. Duza, 30.00zl");
        System.out.println("4. Ogromna, 35.00zl");
        System.out.println("Wybierz pizze:");
    }

    private void printOrder(String finalOrder, double orderedPizzaPrice, int ingredients) {
        System.out.println("Zamowienie: " + finalOrder + " - " + df.format(orderedPizzaPrice) + "zl");
        System.out.println("Ilosc dodatkow: " + ingredients);
    }

    private String countFinalOrder(Pizza orderedPizza) {
        String finalOrder = orderedPizza.getDescription();
        finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
        return finalOrder;
    }
}
