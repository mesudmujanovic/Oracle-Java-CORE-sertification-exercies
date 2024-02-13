package org.example.ConcurencyThreadsSynch.Examp3;

public class RunnableExamp implements Runnable {

    @Override
    public void run() {

        for(int i = 0; i < 5; i++){
            System.out.println("Moja nit Broj " + i);
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
