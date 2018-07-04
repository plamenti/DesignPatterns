package com.plamenti;

import com.plamenti.Behaviors.FlyBehaviors.FlyNoWay;
import com.plamenti.Behaviors.QuackBehaviors.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display(){
        System.out.println("I'm model duck...");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
