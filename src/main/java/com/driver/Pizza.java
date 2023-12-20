package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingPrice;
    private int takeAwayPrice;
    private boolean cheese = false;
    private boolean toppings  = false;
    private boolean takeaway = false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price  = 300;
            cheesePrice  = 80;
            toppingPrice  = 70;
        }
        else {
            this.price = 400;
            cheesePrice  = 80;
            toppingPrice  = 120;
        }

        takeAwayPrice  = 20;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.cheese  = true;
    }

    public void addExtraToppings(){
        // your code goes here
        toppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        takeaway = true;

    }

    public String getBill(){
        // your code goes here
        bill  = "Base price of pizza:"+this.price+ "\n";
        if(cheese){
            bill += "Extra Cheese Added:"+this.cheesePrice+"\n";
            this.price += cheesePrice;
        }
        if(toppings){
            bill += "Extra Toppings Added:" +this.toppingPrice+"\n";
            this.price += toppingPrice;
        }
        if(takeaway){
            bill += "Paperbag Added:"+this.takeAwayPrice+"\n";
            this.price += takeAwayPrice;
        }
        bill += "Total Price:"+this.price;
        return bill;
    }
}
