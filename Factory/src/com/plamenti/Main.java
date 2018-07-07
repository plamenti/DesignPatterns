package com.plamenti;

import com.plamenti.factoryMethod.ChicagoPizzaStore;
import com.plamenti.factoryMethod.NYPizzaStore;
import com.plamenti.simpleFactory.Pizza;
import com.plamenti.simpleFactory.PizzaSimpleFactory;
import com.plamenti.simpleFactory.PizzaStore;

public class Main {

    public static void main(String[] args) {
        // Test Simple Factory
//        PizzaSimpleFactory factory = new PizzaSimpleFactory();
//        PizzaStore store = new PizzaStore(factory);
//
//        Pizza pizza = store.orderPizza("cheese");
//        System.out.println("Ordered pizza: " + pizza.getName());
//        System.out.println(pizza);
//
//        pizza = store.orderPizza("clam");
//        System.out.println("Ordered pizza: " + pizza.getName());
//        System.out.println(pizza);

        // Test Factory Method
//        com.plamenti.factoryMethod.PizzaStore chicagoStore = new ChicagoPizzaStore();
//        com.plamenti.factoryMethod.PizzaStore nyStore = new NYPizzaStore();
//        com.plamenti.factoryMethod.Pizza pizza = nyStore.orderPizza("cheese");

        com.plamenti.abstractFactory.stores.PizzaStore chicagoStore = new com.plamenti.abstractFactory.stores.ChicagoPizzaStore();
        com.plamenti.abstractFactory.stores.PizzaStore  nyStore = new com.plamenti.abstractFactory.stores.NYPizzaStore();

        com.plamenti.abstractFactory.pizzas.Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza);
        System.out.println("Ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza);
        System.out.println("Ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println(pizza);
        System.out.println("Ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println(pizza);
        System.out.println("Ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println(pizza);
        System.out.println("Ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println(pizza);
        System.out.println("Ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println(pizza);
        System.out.println("Ordered a " + pizza.getName() + "\n");
    }
}
