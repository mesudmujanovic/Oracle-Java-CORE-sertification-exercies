package org.example.OOPJava.OOP2.InheritanceClass;

public class OPPBuild {
    public static void main(String[] args) {

      Person person = new Person("Mesud", 29);
      Person person1 = new Person("Ensar", 22);
      person.sayHay();
      person1.sayHay();

      ///Create students and call metods
      StudentInheritance studentInheritance = new StudentInheritance("Mesud", 29, 123456);
      StudentInheritance studentInheritance1 = new StudentInheritance("Ensar", 22, 654321);
      StudentInheritance studentInheritance2 = new StudentInheritance("Zeki", 22, 000222);
      studentInheritance2.sayHay(); ///interitance metods from klass Person

//      ///We need create getter how to be allow name and age from Person but i create this print from StudentInheritance
        System.out.println("Name: " + studentInheritance.getName() +
                ", Age: " + studentInheritance.getAge() +
                ", Student Number: " + studentInheritance.getStudentNumInd());
      studentInheritance.studentNumInd();

      /////Interfaces
      person.speak();
      person1.speak();
      studentInheritance1.speak();
    }
}
