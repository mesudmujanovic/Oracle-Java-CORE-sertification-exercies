package org.example.OOPJava.PizzaBillGeneratorOOP;

public class DeluxePizza extends Pizza{

    public DeluxePizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();
    }
}
