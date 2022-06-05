package com.example.a221recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleHolder> {

    public class ExampleHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;


        public ExampleHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }

    private ArrayList<ExampleItem> mExampleLists;

    public ExampleAdapter(ArrayList<ExampleItem> mExampleLists) {
        this.mExampleLists = mExampleLists;
    }


    @NonNull
    @Override
    public ExampleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.example_item,parent,false);

        ExampleHolder viewHolder = new ExampleHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleHolder holder, int position) {
        ExampleItem exampleItem = mExampleLists.get(position);
        TextView textView = holder.textView;
        textView.setText(exampleItem.getmText());
        ImageView imageView = holder.imageView;
        imageView.setImageResource((exampleItem.getMyImageResource()));

    }

    @Override
    public int getItemCount() {
        return mExampleLists.size();
    }


}
