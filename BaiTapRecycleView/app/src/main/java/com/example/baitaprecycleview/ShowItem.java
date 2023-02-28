package com.example.baitaprecycleview;

import static com.example.baitaprecycleview.SetImageByUrlExample2.loadImageFromUrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowItem extends AppCompatActivity {

    ImageView img;
    TextView des;
    TextView cap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_item);
        img = findViewById(R.id.imgshow);
        des = findViewById(R.id.worddes);
        cap = findViewById(R.id.wordtitle);

        Intent intent = getIntent();
        String imgs = intent.getStringExtra("imageUrl");
        String title = intent.getStringExtra("caption");
        String caption = intent.getStringExtra("description");
        loadImageFromUrl(imgs,img);
        des.setText(caption);
        cap.setText(title);
    }
}