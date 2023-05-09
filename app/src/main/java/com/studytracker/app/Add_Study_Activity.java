package com.studytracker.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Add_Study_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_study_activity);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("STAT416"));
        courses.add(new Course("CS250"));
        courses.add(new Course("CS251"));
        courses.add(new Course("STAT350"));
        courses.add(new Course("SOC100"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), courses));
    }
}