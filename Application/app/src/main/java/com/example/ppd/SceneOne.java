package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class SceneOne extends AppCompatActivity {
    VideoView video1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_one);

        video1 = (VideoView) findViewById(R.id.video1);
        String path = "android.resource://com.example.ppd/"+R.raw.scene1;
        Uri u = Uri.parse(path);
        video1.setVideoURI(u);

        video1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                    Intent intent = new Intent(SceneOne.this, QuestionOne.class);
                    startActivity(intent);
                    finish();
            }
        });

        video1.start();


//        new Thread(){
//            public void run() {
//                try {
//                    sleep(32000);
//                } catch (Exception e){
//
//                }
//                Intent intent = new Intent(SceneOne.this, QuestionOne.class);
//                startActivity(intent);
//                //finish();
//            }
//        }.start();
    }
}