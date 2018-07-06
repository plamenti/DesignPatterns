package com.plamenti.SimpleFactory;

public class PizzaStore{
    PizzaSimpleFactory factory;

    public PizzaStore(PizzaSimpleFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
