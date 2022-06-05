package com.example.quickchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.rbtngroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rbtnred:
                        relativeLayout.setBackgroundColor(Color.parseColor("#DE4839"));
                        break;
                    case R.id.rbtnblue:
                        relativeLayout.setBackgroundColor(Color.parseColor("#12B0E8"));
                        break;
                    case R.id.rbtngreen:
                        relativeLayout.setBackgroundColor(Color.parseColor("#38CC77"));
                        break;
                }
            }
        });
    }
}