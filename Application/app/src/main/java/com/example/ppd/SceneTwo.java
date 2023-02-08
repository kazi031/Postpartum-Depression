package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class SceneTwo extends AppCompatActivity {
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    VideoView video2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_two);
        Intent intent = getIntent();
        int score = intent.getIntExtra(QuestionOne.EXTRA_YOUR_KEY,0);
        video2 = (VideoView) findViewById(R.id.video2);
        String path = "android.resource://com.example.ppd/"+R.raw.scene2;
        Uri u = Uri.parse(path);
        video2.setVideoURI(u);

        video2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                        Intent intent = new Intent(SceneTwo.this, QuestionTwo.class);
                        intent.putExtra(EXTRA_YOUR_KEY, score);
                        startActivity(intent);
                        finish();
            }
        });

        video2.start();

//        new Thread(){
//            public void run() {
//                try {
//                    sleep(36000);
//                } catch (Exception e){
//
//                }
//                Intent newIntent = new Intent(SceneTwo.this, QuestionTwo.class);
//                newIntent.putExtra(EXTRA_YOUR_KEY,score);
//                startActivity(newIntent);
//                //finish();
//            }
//        }.start();
    }
}