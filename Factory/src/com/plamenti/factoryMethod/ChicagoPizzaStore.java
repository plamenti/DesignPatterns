package com.plamenti.factoryMethod;

import com.plamenti.factoryMethod.chicagoPizzas.ChicagoStyleCheesePizza;
import com.plamenti.factoryMethod.chicagoPizzas.ChicagoStyleClamPizza;
import com.plamenti.factoryMethod.chicagoPizzas.ChicagoStylePepperoniPizza;
import com.plamenti.factoryMethod.chicagoPizzas.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if(type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        } else if(type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        } else if(type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}
