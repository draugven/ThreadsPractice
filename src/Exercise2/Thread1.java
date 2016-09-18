package Exercise2;

import Exercise1.ThreadCreator;

/**
 * Created by Elizaveta Naimark on 17.09.2016.
 */
public class Thread1 extends Thread {
    public final int n;

    public Thread1(int n) {
        this.n = n;
        if (n != 1 && n != 2) throw new UnsupportedIntException("n should be either 1 or 2");
    }

    @Override
    public void run() {
        System.out.println("Hello, it’s Thread 1");
        if (this.n == 2) {
            Thread2 thread2 = new Thread2();
            thread2.start();
            synchronized (thread2) {
                try {
                    thread2.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Bye");
    }
}
