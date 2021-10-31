package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kategoripenyakit extends AppCompatActivity {
    ImageButton backpenyakit;
    ImageButton sariawan;
    ImageButton pegel;
    ImageButton btnflu;
    ImageButton btnbtk;
    ImageButton btnmalaria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategoripenyakit);

        backpenyakit = (ImageButton) findViewById(R.id.backpenyakit);
        pegel = (ImageButton) findViewById(R.id.pegel);
        sariawan = (ImageButton) findViewById(R.id.btnsariawan);
        btnflu = (ImageButton) findViewById(R.id.btnflu);
        btnbtk = (ImageButton) findViewById(R.id.btnbtk);
        btnmalaria = (ImageButton) findViewById(R.id.btnmalaria);

        btnmalaria.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoripenyakit.this, malaria.class);

                startActivity(intent);

            }

        });
        btnbtk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoripenyakit.this, batuk.class);

                startActivity(intent);

            }

        });
        btnflu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoripenyakit.this, flu.class);

                startActivity(intent);

            }

        });
        sariawan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoripenyakit.this, sariawan.class);

                startActivity(intent);

            }

        });
        backpenyakit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoripenyakit.this, category.class);

                startActivity(intent);

            }

        });
        pegel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kategoripenyakit.this, pegalinu.class);

                startActivity(intent);

            }

        });
    }
}