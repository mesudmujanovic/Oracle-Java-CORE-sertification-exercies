package org.example.InitializingObjects.Ex2;

public class Dog extends Mammal {
  public String name = "Rex";
    public static void main(String[] args) {
        Dog d = new Dog();
        Mammal m = d;
        System.out.println(d.name);
        System.out.println(m.toString());
    }
}
