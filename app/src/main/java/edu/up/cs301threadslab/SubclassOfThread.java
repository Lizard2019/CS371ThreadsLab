package edu.up.cs301threadslab;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

/**
 * Created by moran19 on 4/27/2017.
 */
public class SubclassOfThread extends Thread{
    public AnimationView AV;
    private boolean blah = true;

    SubclassOfThread(AnimationView view)
    {
        AV = view;
        AV.addAnimation(new StarAnimation(AV.getMyWidth(), AV.getMyHeight()));
    }

    @Override
    public void run() {
        while(blah) {
            try {
                this.sleep(200);
                AV.postInvalidate();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
