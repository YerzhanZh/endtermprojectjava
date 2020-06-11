package com.project.observer;

import com.project.command.Menu;

public class Orders {

        public static void main(String[] args) {
            
            SystemOfOrders order = new SystemOfOrders();
            Observer firstClient = new Client(11);
            order.addObserver(firstClient);
            order.addOrder("ponchiik");



            SystemOfOrders order2 = new SystemOfOrders();
            order2.addOrder("latte");
            Observer secondClient = new Client(11);
            order2.addObserver(secondClient);
            order2.addOrder(("cake"));




        }
    }


