package com.example.recyclercards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> arrayList = new ArrayList<>();

        arrayList.add(new ExampleItem(R.drawable.node,"Clicked at Studio"));
        arrayList.add(new ExampleItem(R.drawable.oner,"Clicked at Italy"));
        arrayList.add(new ExampleItem(R.drawable.twor,"Clicked at Rome"));
        arrayList.add(new ExampleItem(R.drawable.threer,"Clicked at Greece"));
        arrayList.add(new ExampleItem(R.drawable.fourr,"Clicked at Rome"));
        arrayList.add(new ExampleItem(R.drawable.fiver,"Clicked at Santoroni"));
        arrayList.add(new ExampleItem(R.drawable.sixr,"Clicked at India"));

        recyclerView  = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(arrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

}