package com.learning.pranavjain.basicphrases;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void playMusic (View view){

        Button choice = (Button) view;

        //to know user selected which button.
        int tag = Integer.parseInt(choice.getTag().toString());
        //Log.i("Button clicked "+tag,choice.getTag().toString());

        /*This was my idea. Below i find a better idea from Rob Percival. So the credits go to my teacher.
        MediaPlayer mp1 = MediaPlayer.create(getApplicationContext(), R.raw.doyouspeakenglish);
        MediaPlayer mp2 = MediaPlayer.create(getApplicationContext(), R.raw.goodevening);
        MediaPlayer mp3 = MediaPlayer.create(getApplicationContext(), R.raw.hello);
        MediaPlayer mp4 = MediaPlayer.create(getApplicationContext(), R.raw.howareyou);
        MediaPlayer mp5 = MediaPlayer.create(getApplicationContext(), R.raw.ilivein);
        MediaPlayer mp6 = MediaPlayer.create(getApplicationContext(), R.raw.mynameis);
        MediaPlayer mp7 = MediaPlayer.create(getApplicationContext(), R.raw.please);
        MediaPlayer mp8 = MediaPlayer.create(getApplicationContext(), R.raw.welcome);


        if(tag == 1) {
            mp1.start();
        }else if(tag == 2){
            mp2.start();
        }else if(tag == 3){
            mp3.start();
        }else if(tag == 4){
            mp4.start();
        }else if(tag == 5){
            mp5.start();
        }else if(tag == 6){
            mp6.start();
        }else if(tag == 7){
            mp7.start();
        }else if(tag == 8){
            mp8.start();
        }
        */

        //His implementation of above starts from here.
        int id = view.getId();

        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId,"raw",getPackageName());

        MediaPlayer mp = MediaPlayer.create(this,resourceId);
        mp.start();
    }

}
