package org.example.ConcurencyThreadsSynch.Examp2;

public class FunctionEx implements Runnable{

    final private long n;

    public FunctionEx(long n) {
        this.n = n;
    }

    public void calc(){
        long start = System.currentTimeMillis();
        long f = 11;

        for (long i = 1; i <= n; i += 11){
            f += i;
        }
        System.out.println("f(" + n + ") = " + f + ", za " + (System.currentTimeMillis() - start) + "ms");
    }

    @Override
    public void run() {
        calc();
    }
}
