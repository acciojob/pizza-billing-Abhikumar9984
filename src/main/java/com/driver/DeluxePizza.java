package com.driver;

public class DeluxePizza extends Pizza {
    private int price;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.addExtraCheese();
        super.addExtraToppings();
        super.addTakeaway();
        this.price += super.getPrice();
    }

    @Override
    public int getPrice() {
        return price;
    }

}
