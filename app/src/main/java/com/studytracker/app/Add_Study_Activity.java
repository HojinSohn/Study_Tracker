package com.studytracker.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Add_Study_Activity extends AppCompatActivity implements SelectListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_study_activity);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("STAT416", "TR 10:30-11:20", "HAAS 100"));
        courses.add(new Course("CS250", "MWF 10:30-11:20", "LWSN 100"));
        courses.add(new Course("CS251", "TR 12:30-1:20", "LWSN 100"));
        courses.add(new Course("STAT350", "TR 10:30-11:20", "HAAS 100"));
        courses.add(new Course("SOC100", "TR 10:30-11:20", "WALC 100"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), courses, this));
    }

    @Override
    public void onItemClicked(Course course) {
        Toast.makeText(this, course.getName(), Toast.LENGTH_SHORT).show();
    }
}