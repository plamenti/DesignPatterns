package com.plamenti.decorators;

import com.plamenti.beveragesToBeDecorated.Beverage;

public class Mocha extends CondimentDecorator{
    public final double MOCHA_COST = 0.20;
    public final String MOCHA_NAME = "Mocha";

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", " + MOCHA_NAME;
    }

    @Override
    public double cost(){
        return beverage.cost() + MOCHA_COST;
    }
}
