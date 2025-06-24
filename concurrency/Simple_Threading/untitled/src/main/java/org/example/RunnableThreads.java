package org.example;

public class RunnableThreads implements Runnable{

    private String threadName;
    private String threadColor;

    public RunnableThreads(String threadColor, String threadName) {
        this.threadName = threadName;
        this.threadColor = threadColor;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(threadColor + (i+1) +  " : from " + threadName + ThreadColor.ANSI_RESET);

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
