package org.example;

public class Main {
    public static void main(String[] args) {
        threadByRunnable();
        System.out.println("**********************");
        threadByExtends();
    }

    public static void threadByExtends(){
        System.out.println("Thread using Extends!");

        ExtendsThread thread1 = new ExtendsThread(ThreadColor.ANSI_GREEN, "Thread 1");
        ExtendsThread thread2 = new ExtendsThread(ThreadColor.ANSI_RED, "Thread 2");

        thread1.start();
        thread2.start();
    }

    public static void threadByRunnable(){
        System.out.println("Threading using Runnable");

        RunnableThreads rThread1 = new RunnableThreads(ThreadColor.ANSI_GREEN, "Thread 1");
        RunnableThreads rThread2 = new RunnableThreads(ThreadColor.ANSI_RED, "Thread 2");

        Thread Thread1 = new Thread(rThread1);
        Thread Thread2 = new Thread(rThread2);

        Thread1.start();
        Thread2.start();
    }

}