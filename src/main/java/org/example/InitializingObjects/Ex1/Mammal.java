package org.example.InitializingObjects.Ex1;

public class Mammal {
    static { System.out.println("Hello"); }
    { System.out.println("God Afternoon"); }

    public Mammal () {
        { System.out.println("Mammal"); }
    }
}
