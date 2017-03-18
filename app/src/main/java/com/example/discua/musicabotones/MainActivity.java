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

        s1 = MediaPlayer.create(this, R.raw.Afrojack);
        s2 = MediaPlayer.create(this, R.raw.Avicii);
        s3 = MediaPlayer.create(this, R.raw.DavidGuetta);
        s4 = MediaPlayer.create(this, R.raw.Deadmau5);
        s5 = MediaPlayer.create(this, R.raw.DJSnake);
        s6 = MediaPlayer.create(this, R.raw.Kygo);
        s7 = MediaPlayer.create(this, R.raw.Maroon5);
        s8 = MediaPlayer.create(this, R.raw.Marshmello);
        s9 = MediaPlayer.create(this, R.raw.MartinGarrix);
        s10 = MediaPlayer.create(this, R.raw.MikePosner);
        s11 = MediaPlayer.create(this, R.raw.Rihanna);
        s12 = MediaPlayer.create(this, R.raw.Skrillex);
        s13 = MediaPlayer.create(this, R.raw.SteveAoki);
        s14 = MediaPlayer.create(this, R.raw.Tiesto);
        s15 = MediaPlayer.create(this, R.raw.ZEDD);

    }

    public void playAfrojack(View view) {
        s1.start();
    }

    public void playAvicii(View view) {
        s2.start();
    }

    public void playDavidGuetta(View view) {
        s3.start();
    }

    public void playDeadmau5(View view) {
        s4.start();
    }

    public void playDJSnake(View view) {
        s5.start();
    }

    public void playKYGO(View view) {
        s6.start();
    }

    public void playMaroon5(View view) {
        s7.start();
    }

    public void playMarshmello(View view) {
        s8.start();
    }

    public void playMartinGarrix(View view) {
        s9.start();
    }

    public void playMikePosner(View view) {
        s10.start();
    }

    public void playRihanna(View view) {
        s11.start();
    }

    public void playSkrillex(View view) {
        s12.start();
    }

    public void playSteveAoki(View view) {
        s13.start();
    }

    public void playTiesto(View view) {
        s14.start();
    }

    public void playZEDD (View view) {
        s15.start();
    }

}
