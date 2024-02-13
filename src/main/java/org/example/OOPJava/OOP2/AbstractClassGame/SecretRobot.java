package org.example.OOPJava.OOP2.AbstractClassGame;

public class SecretRobot extends Robot{

    public SecretRobot(double weightKG, String name, String password) {
        super(weightKG, name, password);
    }


    //Didn't work because getter from Robot has final

//    @Override
//    public double getWeightKG() {
//        return 0;
//    }

    @Override
    protected void executionOfTheOrder(String executeTheCommand) {

    }
}
