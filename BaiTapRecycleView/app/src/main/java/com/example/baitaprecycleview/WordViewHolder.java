package com.example.baitaprecycleview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView img;
    TextView wordItemView;
    private Context mContext;
    private final WordListApdapter mAdapter;
    public WordViewHolder( View itemView, WordListApdapter adapter,Context context) {
        super(itemView);
        wordItemView = itemView.findViewById(R.id.word);
        img = itemView.findViewById(R.id.img);
        this.mAdapter = adapter;
        wordItemView.setOnClickListener(this);
        this.mContext = context;
    }

    @Override
    public void onClick(View v) {

    }
}
