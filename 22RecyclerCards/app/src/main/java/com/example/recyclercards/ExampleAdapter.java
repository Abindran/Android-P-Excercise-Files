package com.example.recyclercards;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>{
    //6.2
    private ArrayList<ExampleItem> mExampleItem;
    //1
    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        //4
        ImageView imageView;
        TextView textView;
        //2
        public ExampleViewHolder(@NonNull @androidx.annotation.NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
    //6.1
    public ExampleAdapter(ArrayList<ExampleItem> exampleList){
        mExampleItem = exampleList;
    }
    //3
    @NonNull
    @androidx.annotation.NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull @androidx.annotation.NonNull ViewGroup viewGroup, int i) {
        //5
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.example_item,viewGroup,false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull @androidx.annotation.NonNull ExampleViewHolder exampleViewHolder, int i) {
        //7
        ExampleItem currentItem = mExampleItem.get(i);
        exampleViewHolder.imageView.setImageResource(currentItem.getMyImageResource());
        exampleViewHolder.textView.setText(currentItem.getmText());
    }

    @Override
    public int getItemCount() {
        return mExampleItem.size();    }


}
