package org.example.ConcurencyThreadsSynch.Examp1;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public synchronized void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

