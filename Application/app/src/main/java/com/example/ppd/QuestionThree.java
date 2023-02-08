package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionThree extends AppCompatActivity {
    Button q3b1,q3b2,q3b3,q3b4;
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);
        Intent intent = getIntent();
        int scorePrev = intent.getIntExtra(SceneThree.EXTRA_YOUR_KEY,0);
        System.out.println(scorePrev);
        q3b1 = (Button) findViewById(R.id.q3b1);
        q3b2 = (Button) findViewById(R.id.q3b2);
        q3b3 = (Button) findViewById(R.id.q3b3);
        q3b4 = (Button) findViewById(R.id.q3b4);

        Intent newIntent = new Intent(QuestionThree.this, SceneFour.class);

        q3b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+0;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q3b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+1;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q3b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+2;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q3b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+3;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });
    }
}