package com.example.currencycoverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button euro,pound,dollar,yen,dinar,btc,rubel,ausdollar,candollar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        btc = findViewById(R.id.btc);
        rubel = findViewById(R.id.rubel);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ruppee = editText.getText().toString();
                double ruppeeInEuros = 0;
                if(TextUtils.isEmpty(ruppee)){
                    editText.setError("Empty user input");
                }else{
                    ruppeeInEuros = Double.parseDouble(ruppee) * 0.012;
                    textView.setText(null);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("€ " + decimalFormat.format(ruppeeInEuros));
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ruppee = editText.getText().toString();
                double ruppeeInPounds = 0;
                if(TextUtils.isEmpty(ruppee)){
                    editText.setError("Empty user input");
                }else{
                    ruppeeInPounds = Double.parseDouble(ruppee) * 0.011;
                    textView.setText(null);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("£ " + decimalFormat.format(ruppeeInPounds));
                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ruppee = editText.getText().toString();
                double ruppeeInDollar = 0;
                if(TextUtils.isEmpty(ruppee)){
                    editText.setError("Empty user input");
                }else{
                    ruppeeInDollar = Double.parseDouble(ruppee) * 0.013;
                    textView.setText(null);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("$ " + decimalFormat.format(ruppeeInDollar));
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ruppee = editText.getText().toString();
                double ruppeeInYen = 0;
                if(TextUtils.isEmpty(ruppee)){
                    editText.setError("Empty user input");
                }else{
                    ruppeeInYen = Double.parseDouble(ruppee) * 1.70;
                    textView.setText(null);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("¥ " + decimalFormat.format(ruppeeInYen));
                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ruppee = editText.getText().toString();
                double ruppeeInDinar = 0;
                if(TextUtils.isEmpty(ruppee)){
                    editText.setError("Empty user input");
                }else{
                    ruppeeInDinar = Double.parseDouble(ruppee) * 0.0040;
                    textView.setText(null);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(" د.ك " + decimalFormat.format(ruppeeInDinar));
                }
            }
        });

        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ruppee = editText.getText().toString();
                double ruppeeInBtc = 0;
                if(TextUtils.isEmpty(ruppee)){
                    editText.setError("Empty user input");
                }else{
                    ruppeeInBtc = Double.parseDouble(ruppee) * 0.00000036;
                    textView.setText(null);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(decimalFormat.format(ruppeeInBtc) + " BTC");
                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ruppee = editText.getText().toString();
                double ruppeeInRubel = 0;
                if(TextUtils.isEmpty(ruppee)){
                    editText.setError("Empty user input");
                }else{
                    ruppeeInRubel = Double.parseDouble(ruppee) * 0.89;
                    textView.setText(null);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("₽ " + decimalFormat.format(ruppeeInRubel));
                }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ruppee = editText.getText().toString();
                double ruppeeInAusdollar = 0;
                if(TextUtils.isEmpty(ruppee)){
                    editText.setError("Empty user input");
                }else{
                    ruppeeInAusdollar = Double.parseDouble(ruppee) * 0.018;
                    textView.setText(null);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("AUS$ " + decimalFormat.format(ruppeeInAusdollar));
                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ruppee = editText.getText().toString();
                double ruppeeInCandollar = 0;
                if(TextUtils.isEmpty(ruppee)){
                    editText.setError("Empty user input");
                }else{
                    ruppeeInCandollar = Double.parseDouble(ruppee) * 0.017;
                    textView.setText(null);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("CAN$ " + decimalFormat.format(ruppeeInCandollar));
                }
            }
        });

    }
}