package org.example;

public class AnotherThread extends Thread {
    @Override
    public void run(){
        System.out.println("Hello from another thread (2)." + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
            System.out.println("3 seconds passed, I am awake.");
        }catch (InterruptedException e){
            System.out.println("Someone woke me up");
        }

        System.out.println("I am awake.");
    }
}
