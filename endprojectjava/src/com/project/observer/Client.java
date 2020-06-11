package com.project.observer;

import com.project.observer.exceptions.NumOfOrderException;

import java.util.List;

public class Client implements Observer  {
    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    int numberOfOrder;

        public Client(int numberOfOrder) {
            this.numberOfOrder = numberOfOrder;
        }

        @Override
        public void sort(List<String> orders) {
            System.out.println("Your order number:"+" "+numberOfOrder+"\n You ordered:"+orders+"\n");

        }
    public static void NumOfOrderException(Client client1,Client client2) throws Exception {
        if (client1.getNumberOfOrder()!=client2.getNumberOfOrder()) {
            System.out.println("evrithig correct");
        } else {
            throw new NumOfOrderException();
        }
    }
    }
