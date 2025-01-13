package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the main thread (1).");

        Thread anotherThread1 = new AnotherThread();
        anotherThread1.setName("Another Thread 1====");
        anotherThread1.start();

        Thread anotherThread2 = new AnotherThread();
        anotherThread2.setName("Another Thread 2====");
//        anotherThread2.start();

        new Thread(){
            public void run(){
                System.out.println("Hello from anonymous class thread (3).");
            }
        }.start();

        Runnable myRunnable = new MyRunnable();
        Thread myRunnableThread1 = new Thread(myRunnable);

        myRunnableThread1.start();

        System.out.println("Hello again from the main thread (4).");


    }
}