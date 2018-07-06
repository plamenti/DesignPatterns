package com.plamenti.factoryMethod;

import com.plamenti.factoryMethod.nyPizzas.NYStyleCheesePizza;
import com.plamenti.factoryMethod.nyPizzas.NYStyleClamPizza;
import com.plamenti.factoryMethod.nyPizzas.NYStylePepperoniPizza;
import com.plamenti.factoryMethod.nyPizzas.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        } else if(type.equals("clam")){
            pizza = new NYStyleClamPizza();
        } else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        } else if(type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}
