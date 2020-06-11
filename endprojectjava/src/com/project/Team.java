package com.project;

import com.project.exceptions.NumOfStuffControllException;
import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public List<Barista> getBaristas() {
        return baristas;
    }

    public void setBaristas(List<Barista> baristas) {
        this.baristas = baristas;
    }

    public List<Cashier> getCashiers() {
        return cashiers;
    }

    public void setCashiers(List<Cashier> cashiers) {
        this.cashiers = cashiers;
    }

    private List<Barista> baristas = new ArrayList<Barista>();
    private List<Cashier> cashiers = new ArrayList<Cashier>();

    public void addBarista(Barista barista){
        baristas.add(barista);
    }

    public void removeBarista(Barista barista){
        baristas.remove(barista);
    }

    public void addCashier(Cashier cashier){
        cashiers.add(cashier);
    }

    public void removeCashier(Cashier cashier){
        cashiers.remove(cashier);
    }

    public void createStaff(){
        System.out.println("Team creates a system in cafe..\n");
        for(Barista barista: baristas){
            barista.makeCoffee();
        }
        System.out.println("\n");
        for (Cashier cashier: cashiers){
            cashier.takeOrder();
        }

    }
    public static void NumOfStuffControllException(Team team1) throws Exception {
        if (team1.getBaristas().size() == team1.getCashiers().size()) {
            System.out.println("evrithig correct");
        } else {
            throw new NumOfStuffControllException();
        }
    }
}
