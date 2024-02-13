package org.example.ConcurencyThreadsSynch.Examp1;

import org.example.ConcurencyThreadsSynch.Examp1.BankAccount;
import org.example.ConcurencyThreadsSynch.Examp1.TransactionThread;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
//        account.withdraw(300);
//        account.withdraw(900);
//        System.out.println(account.getBalance());
        Thread thread1 = new TransactionThread(account,500);
        Thread thread2 = new TransactionThread(account, 200);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final balance: " + account.getBalance());
    }
}