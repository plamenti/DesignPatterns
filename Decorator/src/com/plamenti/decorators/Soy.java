package com.plamenti.decorators;

import com.plamenti.beveragesToBeDecorated.Beverage;

public class Soy extends CondimentDecorator{
    public final double SOY_COST = 0.15;
    public final String SOY_NAME = "Soy";

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", " + SOY_NAME;
    }

    @Override
    public double cost(){
        return beverage.cost() + SOY_COST;
    }
}
