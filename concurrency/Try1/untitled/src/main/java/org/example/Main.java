package org.example;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintThread());
        t1.start();
    };

}
