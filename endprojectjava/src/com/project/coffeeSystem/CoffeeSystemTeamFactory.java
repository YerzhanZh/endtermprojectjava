package com.project.coffeeSystem;

import com.project.Barista;
import com.project.Cashier;
import com.project.Client;
import com.project.CoffeeShopFactory;

public class CoffeeSystemTeamFactory implements CoffeeShopFactory {
    @Override
    public  Barista getBarista() {
        return new CoffeeBarista();
    }

    @Override
    public Cashier getCashier() {
        return new UsualCashier();
    }

    @Override
    public  Client getClient() {
        return new UsualClient();
    }
}
