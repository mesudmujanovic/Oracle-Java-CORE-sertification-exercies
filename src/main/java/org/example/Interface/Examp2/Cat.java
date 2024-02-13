package org.example.Interface.Examp2;

import org.example.Interface.Examp2.Interface.Claim;

public class Cat extends Animal implements Claim {

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    protected void Say() {
        System.out.println(getName() + " say grr");
    }

    public Animal getSay(){
        System.out.println(getName() + " say grr");
        return this;
    }

    @Override
    public Animal canClaim() {
        System.out.println(getName() + "can claim");
        return this;
    }
}
