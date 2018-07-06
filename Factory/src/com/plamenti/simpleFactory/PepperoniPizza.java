package com.plamenti.simpleFactory;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza(){
        name = "Pepperoni Piza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced pepperoni");
        toppings.add("Sliced onion");
        toppings.add("Grated parmesan cheese");
    }
}
