package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    ImageButton sidebar;
    ImageButton delima;
    ImageButton kayumanis;
    ImageButton jahe;
    ImageButton apel;
    ImageButton jeruknipis;
    ImageButton bawangputih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        sidebar = (ImageButton) findViewById(R.id.sidebar);
        delima = (ImageButton) findViewById(R.id.delima);
        kayumanis = (ImageButton) findViewById(R.id.kayumanis);
        jahe = (ImageButton) findViewById(R.id.jahe);
        apel = (ImageButton) findViewById(R.id.apel);
        jeruknipis = (ImageButton) findViewById(R.id.jeruknipis);
        bawangputih = (ImageButton) findViewById(R.id.bawangputih);

        sidebar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, category.class);

                startActivity(intent);

            }

        });


        delima.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, delima.class);

                startActivity(intent);

            }

        });

        kayumanis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, kayumanis.class);

                startActivity(intent);

            }

        });

        jahe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, jahe.class);

                startActivity(intent);

            }

        });

        apel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, apel.class);

                startActivity(intent);

            }

        });

        jeruknipis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, jeruknipis.class);

                startActivity(intent);

            }

        });

        bawangputih.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, bawangputih.class);

                startActivity(intent);

            }

        });


    }
}