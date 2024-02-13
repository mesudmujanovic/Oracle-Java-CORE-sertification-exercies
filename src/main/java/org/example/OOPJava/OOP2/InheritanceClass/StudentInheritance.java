package org.example.OOPJava.OOP2.InheritanceClass;

public class StudentInheritance extends Person implements Speakable {

   private int numIndex;

    public StudentInheritance(String name, int age, int numIndex) {
        super(name, age);
        this.numIndex = numIndex;
    }

    void studentNumInd() {
        System.out.println("Name: " + getName() +
                ", Age: " + getAge() +
                ", Student Index: " + numIndex);
    }

    public int getStudentNumInd() {
        return numIndex;
    }

    @Override
    public void speak() {
        System.out.println("Hello from interface. I am a student with index " + numIndex);
    }
}
