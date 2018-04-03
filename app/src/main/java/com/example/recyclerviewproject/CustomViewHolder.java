package com.example.recyclerviewproject;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public  class CustomViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageview;
    public TextView textView;
    public CheckBox checkBox;

    public CustomViewHolder(View view) {

        super(view);
        imageview=(ImageView) view.findViewById(R.id.imageView);
        textView=(TextView) view.findViewById(R.id.textView);
        checkBox=(CheckBox) view.findViewById(R.id.checkBox);

    }
}
