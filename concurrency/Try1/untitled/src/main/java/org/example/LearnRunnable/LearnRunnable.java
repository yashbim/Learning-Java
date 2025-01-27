package org.example.LearnRunnable;

public class LearnRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintThread("Thread 1"));
        Thread t2 = new Thread(new PrintThread("Thread 2"));
        t1.start();
        t2.start();
    };

}
