package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class SceneThree extends AppCompatActivity {
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    VideoView video3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_three);
        Intent intent = getIntent();
        int score = intent.getIntExtra(QuestionTwo.EXTRA_YOUR_KEY,0);
        video3 = (VideoView) findViewById(R.id.video3);
        String path = "android.resource://com.example.ppd/"+R.raw.scene3;
        Uri u = Uri.parse(path);
        video3.setVideoURI(u);

        video3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                        Intent intent = new Intent(SceneThree.this, QuestionThree.class);
                        intent.putExtra(EXTRA_YOUR_KEY, score);
                        startActivity(intent);
                        finish();
            }
        });

        video3.start();

//        new Thread(){
//            public void run() {
//                try {
//                    sleep(47000);
//                } catch (Exception e){
//
//                }
//                Intent newIntent = new Intent(SceneThree.this, QuestionThree.class);
//                newIntent.putExtra(EXTRA_YOUR_KEY,score);
//                startActivity(newIntent);
//                //finish();
//            }
//        }.start();
    }
}