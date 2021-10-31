package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class jeruknipis extends AppCompatActivity {
    ImageButton back5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeruknipis);

        back5 = (ImageButton) findViewById(R.id.panahjeruknipis);

        back5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(jeruknipis.this, Home.class);

                startActivity(intent);

            }

        });
    }
}