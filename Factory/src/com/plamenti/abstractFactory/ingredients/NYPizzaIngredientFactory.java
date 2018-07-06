package com.plamenti.abstractFactory.ingredients;

import com.plamenti.abstractFactory.ingredients.cheese.Cheese;
import com.plamenti.abstractFactory.ingredients.cheese.ReggianoCheese;
import com.plamenti.abstractFactory.ingredients.clams.Clams;
import com.plamenti.abstractFactory.ingredients.clams.FreshClams;
import com.plamenti.abstractFactory.ingredients.dough.Dough;
import com.plamenti.abstractFactory.ingredients.dough.ThinCrustDough;
import com.plamenti.abstractFactory.ingredients.pepperoni.Pepperoni;
import com.plamenti.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import com.plamenti.abstractFactory.ingredients.sauce.MarinaraSauce;
import com.plamenti.abstractFactory.ingredients.sauce.Sauce;
import com.plamenti.abstractFactory.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough(){
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese(){
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies(){
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam(){
        return new FreshClams();
    }
}
