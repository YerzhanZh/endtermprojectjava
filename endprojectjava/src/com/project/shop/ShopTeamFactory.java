package com.project.shop;

import com.project.Barista;
import com.project.Cashier;
import com.project.Client;
import com.project.CoffeeShopFactory;

public class ShopTeamFactory implements CoffeeShopFactory {
    @Override
    public Barista getBarista() {
        return new SuperBarista();
    }

    @Override
    public Cashier getCashier() {
        return new FirstCashier();
    }

    @Override
    public Client getClient() {
        return new TopClient();
    }
}
