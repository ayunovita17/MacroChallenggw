package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class category extends AppCompatActivity {

    ImageButton tanamanherbal;
    ImageButton videotutorial;
    ImageButton resep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        tanamanherbal = (ImageButton) findViewById(R.id.tanamanherbal);
        videotutorial = (ImageButton) findViewById(R.id.buttonvideo);
        resep = (ImageButton) findViewById(R.id.resep);

        tanamanherbal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(category.this, Home.class);

                startActivity(intent);

            }

        });

        videotutorial.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(category.this, kategoritutorial.class);

                startActivity(intent);

            }

        });

        resep.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(category.this, kategoripenyakit.class);

                startActivity(intent);

            }

        });
    }
}