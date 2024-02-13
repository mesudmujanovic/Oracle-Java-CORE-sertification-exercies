package org.example.Interface.Examp2;

public abstract class Animal {

    final private String name;
    final private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract protected void Say();
}
