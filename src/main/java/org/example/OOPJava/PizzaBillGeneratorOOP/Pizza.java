package org.example.OOPJava.PizzaBillGeneratorOOP;

public class Pizza {

    private int price;

    private Boolean veg;

    private int extraCheesePrice = 100;

    private int extraToppingPrice = 150;

    private int backPack = 20;

    private Boolean isOptedTakeAway = false;

    private Boolean isOptedExtraCheese = false;

    private Boolean isOptedExtraTopping = false;

    private int basePizza;


    public Pizza(Boolean veg) {
        this.veg = veg;

        if(veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.basePizza = this.price;
    }

    public void addExtraCheese() {
        this.isOptedExtraCheese = true;
        System.out.println("Extra cheese added");
        this.price += this.extraCheesePrice;
    }

    public void addExtraTopping() {
        this.isOptedExtraTopping = true;
        System.out.println("Extra topping added");
        this.price += this.extraToppingPrice;
    }

    public void takeAway() {
        this.isOptedTakeAway = true;
        System.out.println("Take away");
        this.price += this.backPack;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza " + " " + this.price);
        if(isOptedExtraCheese) {
            bill += "Extra cheese added " + " " + this.extraCheesePrice;
        }

        if(isOptedExtraTopping) {
            bill += "Extra Topping added " + " " + this.extraToppingPrice;
        }

        if(isOptedTakeAway) {
            bill += "Take away:"  + " " +  this.backPack;
        }

        bill += "Bill" + " " + price;
        System.out.println(bill);
    }
 }
