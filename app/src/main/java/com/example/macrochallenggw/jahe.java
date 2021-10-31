package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class jahe extends AppCompatActivity {
    ImageButton back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jahe);

        back3 = (ImageButton) findViewById(R.id.panahjahe);

        back3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(jahe.this, Home.class);

                startActivity(intent);

            }

        });
    }
}