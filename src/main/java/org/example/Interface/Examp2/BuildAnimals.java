package org.example.Interface.Examp2;

public class BuildAnimals {
    public static void main(String[] args) {
        Bird bird = new Bird("Pigeon", "white");
            bird.fly();
            bird.Say();

        Animal cat = new Cat("Jery", "black")
                .canClaim();
                 cat.Say();
    }
}
