package org.example.BuildingBlock;

public class Objects {

    private String name = "Chip";

    public Objects() {
        name = "Tady";
        System.out.println("Inside the consturctor");
    }
    {System.out.println("Inside the initializer block");}

    public static void main(String[] args) {
        Objects objects = new Objects();
        System.out.println(objects.name);
    }
}
