package com.project;

import com.project.shop.ShopTeamFactory;


public class Order {
    public static void main(String[] args) {
        CoffeeShopFactory systemOrder = new ShopTeamFactory();
        Barista barista = systemOrder.getBarista();
        Cashier cashier = systemOrder.getCashier();
        Client client = systemOrder.getClient();

        System.out.println("Creating order..");
        cashier.takeOrder();
        barista.makeCoffee();
        cashier.sellCoffee();
        client.buyCoffee();


        System.out.println("======================================================================");






    }
}
