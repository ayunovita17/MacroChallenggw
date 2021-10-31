package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class apel extends AppCompatActivity {
    ImageButton back4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apel);

        back4 = (ImageButton) findViewById(R.id.panahapel);

        back4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(apel.this, Home.class);

                startActivity(intent);

            }

        });
    }
}