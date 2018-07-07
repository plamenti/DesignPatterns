package com.plamenti.doubleCheckedLocking;

public class Singleton{
    private volatile static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Double Checked Locking Singleton!";
    }

}
