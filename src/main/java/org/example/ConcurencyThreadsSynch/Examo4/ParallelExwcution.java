package org.example.ConcurencyThreadsSynch.Examo4;

public class ParallelExwcution {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("First thread execution any task..."));
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("Second thread execution any second task..."));
        thread1.start();
    }
}
