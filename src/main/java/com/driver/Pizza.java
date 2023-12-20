package com.driver;

public class Pizza {

    private int basePrice;
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
            basePrice  = 300;
            this.price  = 300;
            cheesePrice  = 80;
            toppingPrice  = 70;
        }
        else {
            basePrice  = 400;
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
        if(cheese == false){
            this.price += this.cheesePrice;
        }
        this.cheese  = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppings==false){
            this.price += this.toppingPrice;
        }
        toppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(takeaway==false){
            this.price += takeAwayPrice;
        }
        takeaway = true;

    }

    public String getBill(){
        // your code goes here
        bill  = "Base Price Of The Pizza: "+basePrice+ "\n";
        if(cheese){
            bill += "Extra Cheese Added: "+this.cheesePrice+"\n";
        }
        if(toppings){
            bill += "Extra Toppings Added: " +this.toppingPrice+"\n";
        }
        if(takeaway){
            bill += "Paperbag Added: "+this.takeAwayPrice+"\n";
        }
        bill += "Total Price: "+this.price+"\n";
        return bill;
    }
}
