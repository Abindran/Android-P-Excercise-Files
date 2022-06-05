package com.example.twodiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rollTheDice(View view){
        roll(findViewById(R.id.dice1));
        roll(findViewById(R.id.dice2));
    }
    private void roll(ImageView view){
        ImageView imageView = view;
        int randomNumber = random.nextInt(6) + 1;
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