package com.plamenti.decorators;

import com.plamenti.beveragesToBeDecorated.Beverage;

public class Whip extends CondimentDecorator{
    public final double WHIP_COST = 0.10;
    public final String WHIP_NAME = "Whip";

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", " + WHIP_NAME;
    }

    @Override
    public double cost(){
        return beverage.cost() + WHIP_COST;
    }
}
