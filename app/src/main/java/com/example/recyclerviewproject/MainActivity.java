package com.example.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.rvView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<OtherJavaFile> arrayList_javafile=new ArrayList<>();
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        arrayList_javafile.add(new OtherJavaFile("Math",false,R.drawable.math));
        AdapterClass adapterClass=new AdapterClass(this,arrayList_javafile);
        recyclerView.setAdapter(adapterClass);

        RecyclerView.ItemDecoration itemDecoration=new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);


    }
}
