package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bawangputih extends AppCompatActivity {
    ImageButton back6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bawangputih);

        back6 = (ImageButton) findViewById(R.id.panahbawangputih);

        back6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(bawangputih.this, Home.class);

                startActivity(intent);

            }

        });
    }
}