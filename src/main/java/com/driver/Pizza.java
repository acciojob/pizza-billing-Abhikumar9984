package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheese = false;
    private boolean toppings  = false;
    private boolean takeaway = false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price  = 300;
        }
        else
            this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheese==false) {
            this.price += 80;
            cheese = true;
        }
        else
            return;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg) {
            if(toppings == false) {
                this.price += 70;
                toppings = true;
            }
            else
                return;
        }
        else {
            if(toppings == false) {
                this.price += 120;
                toppings = true;
            }
            else
                return;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeaway == false) {
            this.price += 20;
            takeaway = true;
            return;
        }
        else
            return;


    }

    public String getBill(){
        // your code goes here
        return "Total Price: "+ this.price;
    }
}
