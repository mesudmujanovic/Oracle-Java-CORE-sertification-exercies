package org.example.OOPJava.OOP2.AbstractClassGame;

public class AutoRobot extends Robot{

    private double speedKMH;

    public AutoRobot(double weightKG, String name, String password, double speedKMH) {
        super(weightKG, name, password);
        this.speedKMH = speedKMH;
    }



    @Override
    protected void executionOfTheOrder(String executeTheCommand) {
         if(executeTheCommand.equals("Move")){
             System.out.println(getName() + "is moving");
         } else if (executeTheCommand.equals(getName() + "Stop")){
             System.out.println(getName() + "is stopping");
         } else {
             System.out.println("This command is not supported");
         }
    }
}
