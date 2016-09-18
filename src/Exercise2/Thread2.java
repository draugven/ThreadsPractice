package Exercise2;

/**
 * Created by Elizaveta Naimark on 17.09.2016.
 */
public class Thread2 extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Thread 2 is hear!");
            notify();
        }
    }
}
