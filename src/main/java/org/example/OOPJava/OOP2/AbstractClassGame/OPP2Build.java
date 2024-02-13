package org.example.OOPJava.OOP2.AbstractClassGame;

import java.util.ArrayList;

public class OPP2Build {
    public static void main(String[] args) {

        ArrayList<Robot> robots = new ArrayList<>();
//        Robot r1 = new AutoRobot(500, "MesudAutoRobot", "robot123", 330);
//        Robot r2 = new FlyingRobot(600,"MesudFlyingRobot", "robot321", 400);
//        r2.running("robot321", "dddd");
//        r1.running("robot123", "Move");
//        r1.running("robot1234", "Move"); //pass isn't correct but command is correct
//        r1.running("robot123", "Movesss"); //pass is correct but command isn't correct

        //Clean code// Better solution

        robots.add(new AutoRobot(500, "AutoRobot", "robot123", 330));
        robots.add(new FlyingRobot(600,"FlyingRobot", "robot321", 400));
        robots.add(new SecretRobot(600,"SecretRobot", "robot111"));
        robots.add(new FakeFlyingRobot(30,"FakeRobot", "fake123", 1200));
        for (Robot r : robots){
          r.running("robot321", "dddd");
          r.running("robot123", "Move");
          r.running("robot1234", "Move");
          r.running("robot123", "Movesss");
          System.out.println("Your name is " + r.getName() + "Your height isc" + r.getWeightKG());
        }

    }
}
