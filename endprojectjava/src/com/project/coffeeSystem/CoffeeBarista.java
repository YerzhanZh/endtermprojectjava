package com.project.coffeeSystem;

import com.project.Barista;

public class CoffeeBarista implements Barista {
    @Override
    public void makeCoffee() {
        System.out.println("Coffee Barista makes a coffee");
    }
}
