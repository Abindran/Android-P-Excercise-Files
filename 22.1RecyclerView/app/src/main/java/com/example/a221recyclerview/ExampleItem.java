package com.example.a221recyclerview;


import android.widget.ImageView;

import java.util.ArrayList;

public class ExampleItem {
    int myImageResource;
    String mText;

    public ExampleItem(int myImageResource, String mText) {
        this.myImageResource = myImageResource;
        this.mText = mText;
    }

    public int getMyImageResource() {
        return myImageResource;
    }

    public String getmText() {
        return mText;
    }

    public static ArrayList<ExampleItem> createItemList(){
        ArrayList<ExampleItem> exampleItems = new ArrayList<>();
        ExampleItem item1 = new ExampleItem(R.drawable.node,"Clicked At Studio");
        exampleItems.add(item1);
        exampleItems.add(new ExampleItem(R.drawable.oner,"Clicked at Italy"));
        exampleItems.add(new ExampleItem(R.drawable.twor,"Clicked at Rome"));
        exampleItems.add(new ExampleItem(R.drawable.threer,"Clicked at Greece"));
        exampleItems.add(new ExampleItem(R.drawable.fourr,"Clicked at Rome"));
        exampleItems.add(new ExampleItem(R.drawable.fiver,"Clicked at Santoroni"));
        exampleItems.add(new ExampleItem(R.drawable.sixr,"Clicked at India"));
        
        return  exampleItems;
    }
}
