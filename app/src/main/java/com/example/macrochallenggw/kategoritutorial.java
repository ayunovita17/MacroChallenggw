package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kategoritutorial extends AppCompatActivity {
    ImageButton video1;
    ImageButton video2;
    ImageButton video3;
    ImageButton video4;
    ImageButton video5;
    ImageButton video6;
    ImageButton kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategoritutorial);

        video1 = (ImageButton) findViewById(R.id.video1);
        video2 = (ImageButton) findViewById(R.id.video2);
        video3 = (ImageButton) findViewById(R.id.video3);
        video4 = (ImageButton) findViewById(R.id.video4);
       video5 = (ImageButton) findViewById(R.id.video5);
        video6 = (ImageButton) findViewById(R.id.video6);
        kembali = (ImageButton) findViewById(R.id.kembali);

        video1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoritutorial.this, videotutorialdelima.class);

                startActivity(intent);

            }

        });


        video2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoritutorial.this, videotutorialkayumanis.class);

                startActivity(intent);

            }

        });

        video3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoritutorial.this, videotutorialjahe.class);

                startActivity(intent);

            }

        });

        video4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoritutorial.this, videotutorialapel.class);

                startActivity(intent);

            }

        });

        video5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoritutorial.this, videotutorialjeruknipis.class);

                startActivity(intent);

            }

        });

        video6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoritutorial.this, videotutorialbawangputih.class);

                startActivity(intent);

            }

        });
        kembali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoritutorial.this, Home.class);

                startActivity(intent);

            }

        });

    }
}