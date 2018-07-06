package com.plamenti.abstractFactory.ingredients;

import com.plamenti.abstractFactory.ingredients.cheese.Cheese;
import com.plamenti.abstractFactory.ingredients.clams.Clams;
import com.plamenti.abstractFactory.ingredients.dough.Dough;
import com.plamenti.abstractFactory.ingredients.pepperoni.Pepperoni;
import com.plamenti.abstractFactory.ingredients.sauce.Sauce;
import com.plamenti.abstractFactory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory{
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
