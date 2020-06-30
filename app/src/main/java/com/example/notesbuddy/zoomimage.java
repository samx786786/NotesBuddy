package com.example.notesbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class zoomimage extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoomimage);
        imageView=findViewById(R.id.zoom);
        Bundle bundle2=getIntent().getExtras();
        if(bundle2!=null){
            Picasso.get().load( bundle2.getString( "eye")).into(imageView);
        }
    }
}