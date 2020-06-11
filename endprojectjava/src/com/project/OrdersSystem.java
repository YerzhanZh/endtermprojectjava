package com.project;

import com.project.coffeeSystem.CoffeeSystemTeamFactory;

public class OrdersSystem {
    public static void main(String[] args) {
        CoffeeShopFactory systemOrder = new CoffeeSystemTeamFactory();
        Barista barista = systemOrder.getBarista();
        Cashier cashier = systemOrder.getCashier();
        Client client = systemOrder.getClient();

        System.out.println("Creating system of orders...");
        cashier.takeOrder();
        barista.makeCoffee();
        cashier.sellCoffee();
        client.buyCoffee();
        client.complaintFor();
    }
}
