package com.project.shop;

import com.project.Barista;

public class SuperBarista implements Barista {
    @Override
    public void makeCoffee() {
        System.out.println("Super Barista makes a coffeee...");

    }
}
