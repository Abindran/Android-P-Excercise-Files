package com.example.customgradle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showToast(View view){
        switch (view.getId()){
            case R.id.errorbutton:
                Toasty.error(this,"Login failed!!",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.successbutton:
                Toasty.success(this,"Login success...",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.infobutton:
                Toasty.info(this,"Information",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.warningbutton:
                Toasty.warning(this,"oops!!",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.imagebutton:
                Toasty.normal(this,"Image uploaded",Toasty.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_cloud)).show();
                break;
        }
    }
}