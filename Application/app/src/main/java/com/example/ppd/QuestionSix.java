package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionSix extends AppCompatActivity {
    Button q6b1,q6b2,q6b3,q6b4;
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_six);
        Intent intent = getIntent();
        int scorePrev = intent.getIntExtra(SceneSix.EXTRA_YOUR_KEY,0);
        System.out.println(scorePrev);
        q6b1 = (Button) findViewById(R.id.q6b1);
        q6b2 = (Button) findViewById(R.id.q6b2);
        q6b3 = (Button) findViewById(R.id.q6b3);
        q6b4 = (Button) findViewById(R.id.q6b4);

        Intent newIntent = new Intent(QuestionSix.this, Result.class);

        q6b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+0;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q6b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+1;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q6b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+2;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q6b4.setOnClickListener(new View.OnClickListener() {
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