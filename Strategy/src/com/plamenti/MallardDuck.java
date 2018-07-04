package com.plamenti;

import com.plamenti.Behaviors.FlyBehaviors.FlyWithWings;
import com.plamenti.Behaviors.QuackBehaviors.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display(){
        System.out.println("I'm real mallard duck...");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
