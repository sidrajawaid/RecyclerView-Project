package com.example.recyclerviewproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sidra on 2/10/2018.
 */

public class AdapterClass extends RecyclerView.Adapter<CustomViewHolder> {
    Context context;
    ArrayList<OtherJavaFile> arrayList_otjerjavafile;
    public AdapterClass(Context context,ArrayList<OtherJavaFile> otherfile) {
        this.arrayList_otjerjavafile=otherfile;
        this.context=context;
    }
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.secondayoutfile, null, false);
        return new CustomViewHolder(view) {

        };
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        OtherJavaFile otherJavaFile=arrayList_otjerjavafile.get(position);
        holder.imageview.setImageResource(otherJavaFile.subject_image);
        holder.textView.setText(otherJavaFile.subject);
        holder.checkBox.setChecked(otherJavaFile.homeworkDone);

    }

    @Override
    public int getItemCount() {
        return arrayList_otjerjavafile.size();
    }

}
