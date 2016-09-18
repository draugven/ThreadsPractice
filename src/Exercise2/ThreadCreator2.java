package Exercise2;

/**
 * Created by Elizaveta Naimark on 17.09.2016.
 */
public class ThreadCreator2 {
    public static void createThreads2(int n){
        Thread1 thread1 = new Thread1(n);
        thread1.start();
    }
}
