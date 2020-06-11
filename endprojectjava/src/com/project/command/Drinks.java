package com.project.command;

public class Drinks {
    public String typeOfDrink;
    public String productName;


    public Drinks(String typeOfDrink, String productName) {
        this.typeOfDrink = typeOfDrink;
        this.productName = productName;

    }

    public String getTypeOfDrink() {
        return typeOfDrink;
    }

    public void setTypeOfDrink(String typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void type(){
        System.out.println("Type of Drink:"+typeOfDrink +" "+ "of"+" "+productName );
    }
}
