package com.example.examtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mnumber,done;
    MediaPlayer m1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1 = MediaPlayer.create(this,R.raw.three);
        mnumber = findViewById(R.id.mnumber);
        done = findViewById(R.id.done);

        new CountDownTimer(10000,1000){
            public void onTick(long millisecondsUntilDone){
                mnumber.setText("Time :" + String.valueOf(millisecondsUntilDone/1000));
            }
            public void onFinish(){
                done.setText("Done");
                m1.start();
            }
        }.start();
    }
}