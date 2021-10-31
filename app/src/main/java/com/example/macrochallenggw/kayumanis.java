package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kayumanis extends AppCompatActivity {
    ImageButton back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayumanis);

        back2 = (ImageButton) findViewById(R.id.panahkayumanis);

        back2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(kayumanis.this, Home.class);

                startActivity(intent);

            }

        });
    }
}