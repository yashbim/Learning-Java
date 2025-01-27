package LearnExtendsThread;

public class Main {
    public static void main(String[] args) {
        ExtendsThread t1 = new ExtendsThread("Thread 1");
        ExtendsThread t2 = new ExtendsThread("Thread 2");

        t1.start();
        t2.start();
    }

}
