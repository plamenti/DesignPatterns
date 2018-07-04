package com.plamenti;

import com.plamenti.Behaviors.FlyBehaviors.FlyNoWay;
import com.plamenti.Behaviors.QuackBehaviors.MuteQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display(){
        System.out.println("I'm decoy duck...");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
