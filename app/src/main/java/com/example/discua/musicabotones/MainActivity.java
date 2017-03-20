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

        s1 = MediaPlayer.create(this, R.raw.afrojack);
        s2 = MediaPlayer.create(this, R.raw.avicii);
        s3 = MediaPlayer.create(this, R.raw.davidguetta);
        s4 = MediaPlayer.create(this, R.raw.deadmau5);
        s5 = MediaPlayer.create(this, R.raw.djsnake);
        s6 = MediaPlayer.create(this, R.raw.kygo);
        s7 = MediaPlayer.create(this, R.raw.maroon5);
        s8 = MediaPlayer.create(this, R.raw.marshmello);
        s9 = MediaPlayer.create(this, R.raw.martingarrix);
        s10 = MediaPlayer.create(this, R.raw.mikeposner);
        s11 = MediaPlayer.create(this, R.raw.rihanna);
        s12 = MediaPlayer.create(this, R.raw.skrillex);
        s13 = MediaPlayer.create(this, R.raw.steveaoki);
        s14 = MediaPlayer.create(this, R.raw.tiesto);
        s15 = MediaPlayer.create(this, R.raw.zedd);

    }

    public void playafrojack(View view) {

        s1.start();
    }

    public void playavicii(View view) {

        s2.start();
    }

    public void playdavidguetta(View view) {

        s3.start();
    }

    public void playdeadmau5(View view) {

        s4.start();
    }

    public void playdjsnake(View view) {

        s5.start();
    }

    public void playkygo (View view) {
        s6.start();
    }

    public void playmaroon5(View view) {

        s7.start();
    }

    public void playmarshmello(View view) {
        s8.start();
    }

    public void playmartingarrix(View view) {
        s9.start();
    }

    public void playmikeposner(View view) {
        s10.start();
    }

    public void playrihanna(View view) {
        s11.start();
    }

    public void playskrillex(View view) {
        s12.start();
    }

    public void playsteveaoki(View view) {
        s13.start();
    }

    public void playtiesto(View view) {
        s14.start();
    }

    public void playzedd (View view) {s15.start();}

}
