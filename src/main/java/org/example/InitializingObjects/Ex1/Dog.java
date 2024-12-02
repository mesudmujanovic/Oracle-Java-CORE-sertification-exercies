package org.example.InitializingObjects.Ex1;

public class Dog extends Mammal {
    private String name = "Rex";
    { System.out.println("name" + name); }

    private static int i = 0;
    static { System.out.println(i); }
    { i++; System.out.println(i); }

    public Dog() {
        { System.out.println("Woof"); }
    }
}
