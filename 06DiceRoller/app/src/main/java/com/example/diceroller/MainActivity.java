package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollOurDice();
            }
        });
    }

    public void rollOurDice(){
        int randomNumber = myRandomNumber.nextInt(6) + 1;

        switch (randomNumber){
            case 1:
                imageView.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.dice_6);
                break;

        }
    }
}