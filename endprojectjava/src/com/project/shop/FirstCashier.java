package com.project.shop;

import com.project.Cashier;

public class FirstCashier implements Cashier {
    @Override
    public void takeOrder() {
        System.out.println("First Cashier takes orders...");

    }

    @Override
    public void sellCoffee() {
        System.out.println("First Cashier sells coffees");

    }
}
