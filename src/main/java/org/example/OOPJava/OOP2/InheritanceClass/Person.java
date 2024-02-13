package org.example.OOPJava.OOP2.InheritanceClass;

public class Person implements Speakable {
   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  public void sayHay() {
        System.out.println("Hello, I am " + name + "and i have" + age);
  }

    @Override
    public void speak() {
        System.out.println("Hello from interface, I am " + name + " and I have " + age + " years old.");
    }
}
