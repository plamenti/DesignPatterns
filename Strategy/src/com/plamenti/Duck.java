package com.plamenti;

import com.plamenti.Interfaces.FlyBehavior;
import com.plamenti.Interfaces.QuackBehavior;

public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;



    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public abstract void Display();

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks can swim!");
    }
}
