package com.plamenti.Behaviors.FlyBehaviors;

import com.plamenti.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I can't fly...");
    }
}
