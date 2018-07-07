package com.plamenti.doubleCheckedLocking;

public class Singleton{
    private volatile static Singleton INSTANCE;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(INSTANCE == null){
            synchronized(Singleton.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }

        return INSTANCE;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Double Checked Locking Singleton!";
    }

}
