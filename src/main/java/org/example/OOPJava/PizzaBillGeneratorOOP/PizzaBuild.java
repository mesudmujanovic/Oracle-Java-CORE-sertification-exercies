package org.example.OOPJava.PizzaBillGeneratorOOP;

public class PizzaBuild {

    public static void main(String[] args) {

        Pizza pizza = new Pizza(false);
        pizza.addExtraTopping();
        pizza.addExtraCheese();
        pizza.takeAway();
        pizza.getBill();

        DeluxePizza pizza1 = new DeluxePizza(true);
        pizza1.getBill();
    }
}