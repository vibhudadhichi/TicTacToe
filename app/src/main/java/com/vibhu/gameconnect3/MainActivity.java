package com.vibhu.gameconnect3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //0 = yellow and 1 = red
    int activePlayer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dropIn(View view)
    {

        ImageView counter = (ImageView) view;

        counter.setTranslationY(-1000f);

        if(activePlayer == 0) {

            counter.setImageResource(R.drawable.yellow);

            activePlayer = 1;
        }
        else{
            counter.setImageResource(R.drawable.red);

            activePlayer = 0;
        }
            counter.animate().translationYBy(1000f).rotation(360).setDuration(300);

    }
}
