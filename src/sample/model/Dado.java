package sample.model;

import java.util.Random;

/** Classes */

public class Dado {
    private int face;

    public Dado(){
        this.face = 0;
    }

    public void lancar(){
        Random random = new Random();
        while (this.face == 0) this.face = random.nextInt(7);
    }
    public int getFace(){
        return face;
    }

    @Override
    public String toString() {
        return "Dado" +
                "face" + face;
    }
}
