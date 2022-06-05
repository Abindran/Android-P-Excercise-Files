package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
    }

    public void submit(View view){
        float rating = ratingBar.getRating();
        if(rating <= 2){
            textView.setText("Rating: " + rating + "\n We will try better!!!.");
        }else if(rating>2 && rating<=3){
            textView.setText("Rating: " + rating + "\n We are constantly improving");
        }else if(rating>3 && rating<=4){
            textView.setText("Rating: " + rating + "\n Thanks improving daily!!!");
        }else if(rating>4 && rating<=5){
            textView.setText("Rating: " + rating + "\n Thank you !!");
        }
    }
}