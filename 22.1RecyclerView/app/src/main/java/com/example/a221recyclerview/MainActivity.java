package com.example.a221recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ExampleItem> exampleItems;
    EditText editText_add,editText_remove;
    Button button_add,button_remove;
    RecyclerView recyclerView;
    ExampleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exampleItems = ExampleItem.createItemList();

        recyclerViewConfig();

        editText_add = findViewById(R.id.edittextadd);
        editText_remove  = findViewById(R.id.edittextdelete);

        button_add = findViewById(R.id.buttonadd);
        button_remove = findViewById(R.id.buttondelete);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText_add.getText().toString() == ""){
                    editText_add.setError("The index field is empty!!");
                    return;
                }
                int position = Integer.parseInt(editText_add.getText().toString());
                addCard(position);
            }
        });

        button_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText_remove.getText().toString() == ""){
                    editText_remove.setError("The index field is empty!!");
                    return;
                }
                int index = Integer.parseInt(String.valueOf(editText_remove.getText()));
                if(index >= 0 && index < exampleItems.size()){
                    exampleItems.remove(index);
                    adapter.notifyItemRemoved(index);
                    return;
                }
                editText_remove.setError("Index is out of bound!!");
            }
        });

    }
    public void recyclerViewConfig(){
        recyclerView = findViewById(R.id.recyclerView);

       adapter = new ExampleAdapter(exampleItems);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void addCard(int position){
        exampleItems.add(position,new ExampleItem(R.drawable.node,"new card added"));
//        adapter.notifyDataSetChanged();
        adapter.notifyItemInserted(position);
    }


}