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

public class videotutorialdelima extends AppCompatActivity {
    private VideoView videoView;
    private MediaController mediaController;
    private Button playVideo;
    ImageButton video1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videotutorialdelima);

        //Inisialisasi VideoView, MediaController dan Button
        videoView = findViewById(R.id.video1);
        playVideo = findViewById(R.id.play1);
        video1 = findViewById(R.id.btn1);
        mediaController = new MediaController(this);

        video1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(videotutorialdelima.this, kategoritutorial.class);

                startActivity(intent);

            }

        });
        //Menjalankan Video saat tombol Play di Klik
        playVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Variable Uri untuk menentukan lokasi Resource Video yang akan ditampilkan
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.delima);

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