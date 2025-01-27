package org.example;

import java.util.Random;

public class PrintThread implements Runnable{
    public void run(){
        for(int i=0; i<10; i++) {
            Random rand = new Random();
            System.out.println("PrintThread is running " + rand.nextInt(100));
        }
    }
}
