package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class SceneFour extends AppCompatActivity {
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    VideoView video4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_four);
        Intent intent = getIntent();
        int score = intent.getIntExtra(QuestionThree.EXTRA_YOUR_KEY,0);
        video4 = (VideoView) findViewById(R.id.video4);
        String path = "android.resource://com.example.ppd/"+R.raw.scene4;
        Uri u = Uri.parse(path);
        video4.setVideoURI(u);

        video4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent intent = new Intent(SceneFour.this, QuestionFour.class);
                intent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(intent);
                finish();
            }
        });

        video4.start();
    }
}