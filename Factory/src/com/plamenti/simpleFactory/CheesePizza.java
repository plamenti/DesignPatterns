package com.plamenti.simpleFactory;

public class CheesePizza extends Pizza{
    public CheesePizza(){
        name = "cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
