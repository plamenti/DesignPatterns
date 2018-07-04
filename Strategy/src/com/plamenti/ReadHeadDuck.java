package com.plamenti;

import com.plamenti.Behaviors.FlyBehaviors.FlyWithWings;
import com.plamenti.Behaviors.QuackBehaviors.Quack;

public class ReadHeadDuck extends Duck{
    public ReadHeadDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display(){
        System.out.println("I'm Red head duck...");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
