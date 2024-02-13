package org.example.OOPJava.OOP2.AbstractClassGame;

public abstract class Robot {

    private double weightKG;
    private String name;
    private String password;

   final public double getWeightKG() {
        return weightKG;
    }

     public String getName() {
        return name;
    }

    public Robot(double weightKG, String name, String password) {
        this.weightKG = weightKG;
        this.name = name;
        this.password = password;
    }

   final public void running(String password, String executeTheCommand){
       if (password.equals(this.password)){
           executionOfTheOrder(executeTheCommand);
       } else {
           System.out.println("Password"  + name + "is not correct");
       }
    }

    abstract protected void executionOfTheOrder(String executeTheCommand);
}
