package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class SceneSix extends AppCompatActivity {
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    VideoView video6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_six);
        Intent intent = getIntent();
        int score = intent.getIntExtra(QuestionFive.EXTRA_YOUR_KEY,0);
        video6 = (VideoView) findViewById(R.id.video6);
        String path = "android.resource://com.example.ppd/"+R.raw.scene6;
        Uri u = Uri.parse(path);
        video6.setVideoURI(u);

        video6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent intent = new Intent(SceneSix.this, QuestionSix.class);
                intent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(intent);
                finish();
            }
        });

        video6.start();
    }
}