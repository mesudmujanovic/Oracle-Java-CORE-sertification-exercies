package org.example.ConcurencyThreadsSynch.Examp1;

import org.example.ConcurencyThreadsSynch.Examp1.BankAccount;

public class TransactionThread extends Thread{

    private BankAccount account;
    private double amount;

    public TransactionThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
