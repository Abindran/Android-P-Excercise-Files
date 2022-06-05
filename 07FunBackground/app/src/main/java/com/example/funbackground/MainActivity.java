package com.example.funbackground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton button =  findViewById(R.id.imageButton);

        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int r =random.nextInt(255);
                int g =random.nextInt(255);
                int b =random.nextInt(255);

                layout.setBackgroundColor(Color.argb(255,r,g,b));
                Toast.makeText(getApplicationContext(),"Changing bg color",Toast.LENGTH_SHORT).show();
            }
        });
    }
}