package org.example.Interface.Examp2;

import org.example.Interface.Examp2.Interface.AnimalFly;

public class Bird extends Animal implements AnimalFly {

    public Bird(String name, String color) {
        super(name, color);
    }

    @Override
    protected void Say() {
         System.out.println(getName() +  "Piuu");
    }


    @Override
    public Boolean fly() {
        if(true){
            System.out.println(getName() + " Fly");
        }
        return false;
    };
}
