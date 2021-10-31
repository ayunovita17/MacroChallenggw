package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class videotutorialjahe extends AppCompatActivity {
    private VideoView videoView;
    private MediaController mediaController;
    private Button play3;
    ImageButton btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videotutorialjahe);

        //Inisialisasi VideoView, MediaController dan Button
        videoView = findViewById(R.id.video3);
        play3 = findViewById(R.id.play3);
        btnback = findViewById(R.id.btnback);
        mediaController = new MediaController(this);

        btnback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(videotutorialjahe.this, kategoritutorial.class);

                startActivity(intent);

            }

        });
        //Menjalankan Video saat tombol Play di Klik
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Variable Uri untuk menentukan lokasi Resource Video yang akan ditampilkan
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.jahe);

                videoView.setVideoURI(uri);

                //Memasang MediaController untuk menampilkan tombol play, pause, dsb
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);

                //Menjalankan Video
                videoView.start();
            }
        });
    }
}