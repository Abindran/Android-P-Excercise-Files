package com.example.uploader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    AppCompatButton start,end,upload;
    ProgressBar progressBar,progressBarHorizontal;
    int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.start);
        end = findViewById(R.id.end);
        upload = findViewById(R.id.upload);
        progressBar = findViewById(R.id.progressBar);
        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
    }
    public void start(View view){
        progressBar.setVisibility(View.VISIBLE);
    }
    public void end(View view){
        progressBar.setVisibility(View.GONE);
    }
    public void upload(View view){
        fakeProgress(progress);
    }
    public void fakeProgress(int progress){

        progressBarHorizontal.setProgress(progress);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fakeProgress(progress + 10);
            }
        });

        thread.start();
    }
}