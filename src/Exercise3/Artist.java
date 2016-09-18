package Exercise3;

/**
 * Created by Elizaveta Naimark on 17.09.2016.
 */
public class Artist extends Thread{
    private String mygraffiti;
    private String mysignature;

    public Artist(String mygraffiti, String mysignature) {
        this.mygraffiti = mygraffiti;
        this.mysignature = mysignature;
    }

    public void createGraffiti(String mygraffiti, String mysignature){
        Wall.wall.setGraffiti(mygraffiti);
        Wall.wall.setSignature(mysignature);
    }

    @Override
    public void run() {
        synchronized (Artist.class) {
            System.out.println(mygraffiti + " " + Wall.wall.toString());
            createGraffiti(mygraffiti, mysignature);
        }
    }
}
