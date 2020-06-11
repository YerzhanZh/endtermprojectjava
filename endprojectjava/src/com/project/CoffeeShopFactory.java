package com.project;

public interface CoffeeShopFactory {
    Barista getBarista();
Cashier getCashier();
Client getClient();
}
