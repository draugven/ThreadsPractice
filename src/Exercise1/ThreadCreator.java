package Exercise1;

/**
 * Created by Elizaveta Naimark on 17.09.2016.
 */
public class ThreadCreator {
    public static void createThreads(int n){
        for(int i = 1; i <= n; i++){
            int finalI = i;

            class NewThread extends Thread{
                @Override
                public void run() {
                    for(int c = 0; c < finalI; c++){
                        System.out.println("Hello, it's Thread " + finalI);
                    }
                }
            }

            NewThread newThread = new NewThread();
            newThread.start();
        }
    }
}
