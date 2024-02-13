package org.example.ConcurencyThreadsSynch.Examp2;

public class Multithreading {
    public static void main(String[] args) {
        FunctionEx f1 = new FunctionEx(222000001);
        FunctionEx f2 = new FunctionEx(322000001);
        FunctionEx f3 = new FunctionEx(422000001);

        f1.calc();
        f2.calc();
        f3.calc();
    }
}
