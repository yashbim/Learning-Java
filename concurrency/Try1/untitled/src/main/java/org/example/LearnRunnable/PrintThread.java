package org.example.LearnRunnable;

import java.util.Random;

public class PrintThread implements Runnable{

    private String fromThread;

    public PrintThread(String fromThread) {
        this.fromThread = fromThread;
    }

    public void run(){
//        System.out.println(fromThread);
        for(int i=0; i<10; i++) {

            if(fromThread == "Thread 1") {
                System.out.println("PrintThread 1 is running " + i);
            } else if (fromThread == "Thread 2") {
                System.out.println("PrintThread 2 is running " + i);
            } else {
                System.out.println(fromThread);
            }
        }
    }
}
