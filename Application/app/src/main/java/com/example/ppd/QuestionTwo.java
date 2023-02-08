package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionTwo extends AppCompatActivity {
    Button q2b1,q2b2,q2b3,q2b4;
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);
        Intent intent = getIntent();
        int scorePrev = intent.getIntExtra(SceneTwo.EXTRA_YOUR_KEY,0);
        System.out.println(scorePrev);
        q2b1 = (Button) findViewById(R.id.q2b1);
        q2b2 = (Button) findViewById(R.id.q2b2);
        q2b3 = (Button) findViewById(R.id.q2b3);
        q2b4 = (Button) findViewById(R.id.q2b4);
        Intent newIntent = new Intent(QuestionTwo.this, SceneThree.class);

        q2b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+0;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q2b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+1;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q2b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+2;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q2b4.setOnClickListener(new View.OnClickListener() {
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