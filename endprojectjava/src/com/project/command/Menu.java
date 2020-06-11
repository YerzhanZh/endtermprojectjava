package com.project.command;

import com.project.command.exceptions.CostException;

public class Menu extends Drinks{
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int cost;

    public Menu(String typeOfDrink, String productName, int cost) {
        super(typeOfDrink, productName);
        this.cost=cost;
    }

    @Override
    public void type(){
        System.out.println("Type of Drink:"+typeOfDrink +" "+ "of"+" "+productName );
    }

    public void insert(){
        System.out.println("Inserting"+" " +super.getProductName() + ": "+cost+" "+"in menu...");
    }

    public void update(){
        System.out.println("Updating"+" "  + super.getProductName()+ ": "+cost+" "+"in menu...");
    }


    public void delete(){
        System.out.println("Deleting"+" " + super.getProductName() + " "+"in menu...");
    }

    public static void ControlMenuCost(Menu menu) throws Exception {
        if (menu.getCost()<=1000) {
            System.out.println("evrithig correct");
        } else {
            throw new CostException();
        }
    }
}
