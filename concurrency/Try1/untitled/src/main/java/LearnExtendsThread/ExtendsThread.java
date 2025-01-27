package LearnExtendsThread;

public class ExtendsThread extends Thread {

    private String ThreadName;

    public ExtendsThread(String ThreadName) {
        this.ThreadName = ThreadName;
    }

    public void run() {
//        System.out.println(");

        for (int i = 0; i<10; i++ ) {
            System.out.println(i + ": " + ThreadName);
        }

    }

}
