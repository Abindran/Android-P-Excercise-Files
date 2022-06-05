package com.example.mybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void helloThere(View view){
//        Log.d("HELLO","Hello there!!!!");
//        Context context = getApplicationContext();
//        CharSequence text = "Hello there is pressed!!!";
//        int duration = Toast.LENGTH_SHORT;
//        Toast toast = Toast.makeText(context,text,duration);
//        toast.show();
//        Toast.makeText(getApplicationContext(),"Hello there is pressed",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Hello there is pressed",Toast.LENGTH_SHORT).show();

    }

    public void heyAndroid(View view){
//        Log.d("HEY","Hey Android!!!!");
//        Context context = getApplicationContext();
//        CharSequence text = "Hey Android is pressed!!!";
//        int duration = Toast.LENGTH_SHORT;
//        Toast toast = Toast.makeText(context,text,duration);
//        toast.show();
        Toast.makeText(this,"Hey Android is pressed",Toast.LENGTH_SHORT).show();
    }

}