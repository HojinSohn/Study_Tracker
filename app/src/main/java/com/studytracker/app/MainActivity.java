package com.studytracker.app;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button add_study, view_graph, set_goals;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        add_study = findViewById(R.id.add_study_time);
        view_graph = findViewById(R.id.display_graph);
        set_goals = findViewById(R.id.set_goal);

        add_study.setOnClickListener(this);
        view_graph.setOnClickListener(this);
        set_goals.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button clickedButton = (Button) view;
        if (clickedButton.getId() == R.id.add_study_time) {
            Intent intent = new Intent(this, Add_Study_Activity.class);
            startActivity(intent);
        } else if (clickedButton.getId() == R.id.display_graph) {

        } else if (clickedButton.getId() == R.id.display_graph) {

        }
    }
}