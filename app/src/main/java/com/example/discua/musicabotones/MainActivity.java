package com.example.discua.musicabotones;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button afrojack;
    Button avicii;
    Button davidguetta;
    Button deadmau5;
    Button djsnake;
    Button kygo;
    Button maroon5;
    Button marshmello;
    Button martingarrix;
    Button mikeposner;
    Button rihanna;
    Button skrillex;
    Button steveaoki;
    Button tiesto;
    Button zedd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        afrojack = (Button) findViewById(R.id.afrojack);
        avicii = (Button) findViewById(R.id.avicii);
        davidguetta = (Button) findViewById(R.id.davidguetta);
        deadmau5 = (Button) findViewById(R.id.deadmau5);
        djsnake = (Button) findViewById(R.id.djsnake);
        kygo = (Button) findViewById(R.id.kygo);
        maroon5 = (Button) findViewById(R.id.maroon5);
        marshmello = (Button) findViewById(R.id.marshmello);
        martingarrix = (Button) findViewById(R.id.martingarrix);
        mikeposner = (Button) findViewById(R.id.mikeposner);
        rihanna = (Button) findViewById(R.id.rihanna);
        skrillex = (Button) findViewById(R.id.skrillex);
        steveaoki = (Button) findViewById(R.id.steveaoki);
        tiesto = (Button) findViewById(R.id.zedd);


        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);

    }

    public void playafrojack (View view) {

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

    public void playzedd (View view) {
        s15.start();
    }




    @Override
    public void onClick(View v) {



    }
}
