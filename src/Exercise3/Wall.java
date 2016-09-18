package Exercise3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Elizaveta Naimark on 17.09.2016.
 */
public class Wall {
    public static Wall wall = new Wall();

    private String graffiti;
    private String signature;

    public String getGraffiti() {
        return graffiti;
    }

    public String getSignature() {
        return signature;
    }

    public void setGraffiti(String graffiti) {
        this.graffiti = graffiti;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "graffiti='" + graffiti + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
