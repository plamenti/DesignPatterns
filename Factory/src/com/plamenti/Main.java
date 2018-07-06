package com.plamenti;

import com.plamenti.SimpleFactory.Pizza;
import com.plamenti.SimpleFactory.PizzaSimpleFactory;
import com.plamenti.SimpleFactory.PizzaStore;

public class Main {

    public static void main(String[] args) {
        // Test Simple Factory
        PizzaSimpleFactory factory = new PizzaSimpleFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ordered pizza: " + pizza.getName());
        System.out.println(pizza);

        pizza = store.orderPizza("clam");
        System.out.println("Ordered pizza: " + pizza.getName());
        System.out.println(pizza);
    }
}
