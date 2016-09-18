import Exercise2.Thread1;
import Exercise2.Thread2;
import Exercise3.Artist;
import Exercise3.Wall;

import static Exercise1.ThreadCreator.createThreads;
import static Exercise2.ThreadCreator2.createThreads2;

/**
 * Created by Elizaveta Naimark on 17.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        //createThreads(4);
        //createThreads2(2);
        for(int i = 1; i <= 10; i++){
            Artist artist = new Artist("Art" + i, "Signature" + i);
            artist.start();
        }
    }
}
