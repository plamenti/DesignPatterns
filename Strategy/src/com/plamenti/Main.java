package com.plamenti;

public class Main {

    public static void main(String[] args) {
	    MallardDuck mallardDuck = new MallardDuck();
	    mallardDuck.display();

        System.out.println("######################");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();

        System.out.println("######################");

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();

        System.out.println("######################");

        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.display();

        System.out.println("######################");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
    }
}
