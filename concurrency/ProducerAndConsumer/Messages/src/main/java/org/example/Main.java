package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();

        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();

    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
        empty = true;
        return message;
    }

    public synchronized void write(String message){
        while(!empty){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages [] = {
                "I am Bimsara",
                "I study at IIT",
                "I am 21 years old",
                "I am from Gampaha"
        };

        Random random = new Random();


        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try{
                Thread.sleep(1000);

            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        message.write("Finished");

    }
}

class Reader implements Runnable {
    private Message message;

    public Reader (Message message) {
        this.message = message;
    }

    public void run() {

        Random random = new Random();
        for (String latestMessage = message.read(); !latestMessage.equals("Finished");
            latestMessage = message.read()){
            System.out.println(latestMessage);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());

            }

        }


    }
}