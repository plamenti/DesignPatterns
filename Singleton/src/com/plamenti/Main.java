package com.plamenti;

import com.plamenti.doubleCheckedLocking.Singleton;

public class Main {

    public static void main(String[] args) {

        // Double Checked Locking
//        Singleton singleton = Singleton.getInstance();
//        System.out.println(singleton.getDescription());

        // statically initialized with public static Factory Method
        com.plamenti.staticallyInitialized.Singleton singleton = com.plamenti.staticallyInitialized.Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
