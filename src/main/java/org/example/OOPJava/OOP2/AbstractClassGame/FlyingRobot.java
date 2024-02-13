package org.example.OOPJava.OOP2.AbstractClassGame;

public class FlyingRobot extends Robot{

    private double maxHeight;

    public FlyingRobot(double weightKG, String name, String password, double maxHeight) {
        super(weightKG, name, password);
        this.maxHeight = maxHeight;
    }


    final public double getMaxHeight(){
        return maxHeight;
    }

    @Override
    protected void executionOfTheOrder(String executeTheCommand) {
        if(executeTheCommand.equals("FLY")){
            System.out.println(getName() + "is flying");
        } else if (executeTheCommand.equals("LAND")){
            System.out.println(getName() + "is landing");
        } else {
            System.out.println("This command is not supported");
        }
    }
}
