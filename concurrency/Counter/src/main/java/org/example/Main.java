package org.example;

public class Main {
    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread1");

        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread2");

        t1.start();
        t2.start();

    }
}

class Countdown {

//    private int i;

    public synchronized void doCountdown() {
        String color;
        String colorName;

        switch (Thread.currentThread().getName()){
            case "Thread1":
                color = ThreadColor.ANSI_GREEN;
                colorName = "Green";
                break;

            case "Thread2":
                color = ThreadColor.ANSI_RED;
                colorName = "Red";
                break;

            default:
                color = ThreadColor.ANSI_BLUE;
                colorName = "Blue";
        }

        for (int i = 10; i>0; i--){
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i + ", color = " + colorName);
        }
    }
}


class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }

}
