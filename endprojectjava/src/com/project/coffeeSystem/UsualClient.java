package com.project.coffeeSystem;

import com.project.Client;

public class UsualClient implements Client {
    @Override
    public void buyCoffee() {
        System.out.println("Usual Client buys coffee...");

    }

    @Override
    public void complaintFor() {
        System.out.println("Usual Client can complaint for..");

    }
}
