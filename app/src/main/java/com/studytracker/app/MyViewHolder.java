package com.studytracker.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder{

    //ImageView imageView;
    public TextView nameView;
    public TextView timeView;
    public TextView desView;
    public CardView cardView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        nameView = itemView.findViewById(R.id.name);
        timeView = itemView.findViewById(R.id.time);
        desView = itemView.findViewById(R.id.description);
        cardView = itemView.findViewById(R.id.main_container);
    }
}
