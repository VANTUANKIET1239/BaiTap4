package com.example.baitaprecycleview;

import static com.example.baitaprecycleview.SetImageByUrlExample2.loadImageFromUrl;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;



public class WordListApdapter extends RecyclerView.Adapter<WordViewHolder> {

    private final LayoutInflater mInflater;
    private  Context context;
    private List<Photo> mWordList = new ArrayList<>();

    public List<Photo> getmWordList() {
        return mWordList;
    }

    public WordListApdapter(Context context, List<Photo> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
        this.context = context;
    }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.layout_item, parent, false);
        return new WordViewHolder(mItemView, this,context);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        Photo mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent.getTitle_photo());
        loadImageFromUrl(mCurrent.getSource_photo(),holder.img);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to move to the other activity and pass the item information
                Intent intent = new Intent(context, ShowItem.class);
                intent.putExtra("imageUrl", mCurrent.getSource_photo());
                intent.putExtra("caption", mCurrent.getTitle_photo());
                intent.putExtra("description", mCurrent.getDescription_photo());
                context.startActivity(intent);
            }
        });


    }


    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
