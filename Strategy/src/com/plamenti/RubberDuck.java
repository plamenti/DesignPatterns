package com.plamenti;

import com.plamenti.Behaviors.FlyBehaviors.FlyNoWay;
import com.plamenti.Behaviors.QuackBehaviors.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display(){
        System.out.println("I'm rubber duck...");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
