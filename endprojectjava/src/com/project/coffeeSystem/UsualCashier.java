package com.project.coffeeSystem;

import com.project.Cashier;

public class UsualCashier implements Cashier {
    @Override
    public void takeOrder() {
        System.out.println("Usual Cashier takes orders..");
    }

    @Override
    public void sellCoffee() {
        System.out.println("Usual Cashier sells coffees");

    }
}
