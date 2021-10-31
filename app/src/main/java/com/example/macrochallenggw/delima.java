package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class delima extends AppCompatActivity {
    ImageButton back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delima);
        back1 = (ImageButton) findViewById(R.id.panahdelima);

        back1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(delima.this, Home.class);

                startActivity(intent);

            }

        });
    }
}