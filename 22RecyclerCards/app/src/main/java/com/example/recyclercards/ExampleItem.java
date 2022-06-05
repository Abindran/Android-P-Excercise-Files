package com.example.recyclercards;

public class ExampleItem {
    private int myImageResource;
    private String mText;

    public ExampleItem(int imageResource,String text){
        myImageResource = imageResource;
        mText = text;
    }

    public int getMyImageResource() {
        return myImageResource;
    }

    public String getmText() {
        return mText;
    }
}
