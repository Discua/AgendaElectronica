package com.example.discua.musicabotones;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer s1;
    MediaPlayer s2;
    MediaPlayer s3;
    MediaPlayer s4;
    MediaPlayer s5;
    MediaPlayer s6;
    MediaPlayer s7;
    MediaPlayer s8;
    MediaPlayer s9;
    MediaPlayer s10;
    MediaPlayer s11;
    MediaPlayer s12;
    MediaPlayer s13;
    MediaPlayer s14;
    MediaPlayer s15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = MediaPlayer.create(this,R.raw.Afrojack);
        s2 = MediaPlayer.create(this,R.raw.Avicii);
        s3 = MediaPlayer.create(this,R.raw.DavidGuetta);
        s4 = MediaPlayer.create(this,R.raw.Deadmau5);
        s5 = MediaPlayer.create(this,R.raw.DJSnake);
        s6 = MediaPlayer.create(this,R.raw.Kygo);
        s7 = MediaPlayer.create(this,R.raw.Maroon5);
        s8 = MediaPlayer.create(this,R.raw.Marshmello);
        s9 = MediaPlayer.create(this,R.raw.MartinGarrix);
        s10 = MediaPlayer.create(this,R.raw.MikePosner);
        s11 = MediaPlayer.create(this,R.raw.Rihanna);
        s12 = MediaPlayer.create(this,R.raw.Skrillex);
        s13 = MediaPlayer.create(this,R.raw.SteveAoki);
        s14 = MediaPlayer.create(this,R.raw.Tiesto);
        s15 = MediaPlayer.create(this,R.raw.ZEDD);

    }
    public void playAfrojacks (View view){
        s1.start();
    }
}
