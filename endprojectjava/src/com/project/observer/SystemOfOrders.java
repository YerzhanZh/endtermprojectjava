package com.project.observer;

import java.util.ArrayList;
import java.util.List;

public class SystemOfOrders implements Observed {

        List<String> orders = new ArrayList<>();
        List<Observer> clients = new ArrayList<>();

        public void addOrder(String order){
            this.orders.add(order);
            notifyObservers();
        }

        public void removeOrder(String order){
            this.orders.remove(order);
            notifyObservers();
        }

        @Override
        public void addObserver(Observer observer) {
            this.clients.add(observer);

        }

        @Override
        public void removeObserver(Observer observer) {
            this.clients.remove(observer);

        }

        @Override
        public void notifyObservers() {
            for(Observer observer : clients){
                observer.sort(this.orders);
            }
        }

    public List<String> getOrders() {
        return orders;
    }
}


