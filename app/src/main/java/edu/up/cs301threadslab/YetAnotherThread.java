package edu.up.cs301threadslab;

/**
 * Created by moran19 on 4/28/2017.
 */
public class YetAnotherThread extends Thread {
    public StarAnimation SA;
    private boolean blah = true;

    YetAnotherThread(StarAnimation star)
    {
        SA = star;
    }

    @Override
    public void run() {
        while(blah)
        {
            try {
                this.sleep(40);
                if(Math.random() > .5) {SA.removeStar();}
                else{SA.addStar();}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
