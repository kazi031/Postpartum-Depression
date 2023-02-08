package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class SceneFive extends AppCompatActivity {
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    VideoView video5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_five);
        Intent intent = getIntent();
        int score = intent.getIntExtra(QuestionFour.EXTRA_YOUR_KEY,0);
        video5 = (VideoView) findViewById(R.id.video5);
        String path = "android.resource://com.example.ppd/"+R.raw.scene5;
        Uri u = Uri.parse(path);
        video5.setVideoURI(u);

        video5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent intent = new Intent(SceneFive.this, QuestionFive.class);
                intent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(intent);
                finish();
            }
        });

        video5.start();
    }
}