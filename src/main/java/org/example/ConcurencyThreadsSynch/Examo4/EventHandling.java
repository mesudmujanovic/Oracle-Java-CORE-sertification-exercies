package org.example.ConcurencyThreadsSynch.Examo4;

public class EventHandling {
    public static void main(String[] args) {
        Thread inputListener = new Thread(() -> {
            System.out.println("Prvi");
        });
        inputListener.start();

        Thread eventHandler = new Thread(() -> {
            System.out.println("Drugi");
        });
        eventHandler.start();
    }
}
