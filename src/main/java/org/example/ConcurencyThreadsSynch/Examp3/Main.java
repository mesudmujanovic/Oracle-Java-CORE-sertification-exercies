package org.example.ConcurencyThreadsSynch.Examp3;

public class Main {
    public static void main(String[] args) {
        RunnableExamp runnableExamp = new RunnableExamp();
        Thread thread = new Thread(runnableExamp);
        thread.start();
        System.out.println("Glavna nit: Radim nešto drugo dok druga nit radi.");

    }
}
