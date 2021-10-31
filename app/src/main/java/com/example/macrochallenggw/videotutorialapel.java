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

public class videotutorialapel extends AppCompatActivity {
    private VideoView videoView;
    private MediaController mediaController;
    private Button play2;
    ImageButton btn;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videotutorialapel);

            //Inisialisasi VideoView, MediaController dan Button
            videoView = findViewById(R.id.video2);
            play2 = findViewById(R.id.play2);
           btn = findViewById(R.id.btn1);
            mediaController = new MediaController(this);

            btn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(videotutorialapel.this, kategoritutorial.class);

                    startActivity(intent);

                }

            });
            //Menjalankan Video saat tombol Play di Klik
            play2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //Variable Uri untuk menentukan lokasi Resource Video yang akan ditampilkan
                    Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.apel);

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