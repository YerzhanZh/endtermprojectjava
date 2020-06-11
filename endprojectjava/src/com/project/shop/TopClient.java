package com.project.shop;

import com.project.Client;

public class TopClient implements Client {
    @Override
    public void buyCoffee() {
        System.out.println("Top Client buys coffee...");

    }

    @Override
    public void complaintFor() {
        System.out.println("Top Client can complaint for..");

    }
}
