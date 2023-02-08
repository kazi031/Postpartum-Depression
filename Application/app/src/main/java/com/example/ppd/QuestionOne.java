package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionOne extends AppCompatActivity {
    Button q1b1,q1b2,q1b3,q1b4;
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);
        q1b1 = (Button) findViewById(R.id.q1b1);
        q1b2 = (Button) findViewById(R.id.q1b2);
        q1b3 = (Button) findViewById(R.id.q1b3);
        q1b4 = (Button) findViewById(R.id.q1b4);
        Intent newIntent = new Intent(QuestionOne.this, SceneTwo.class);

        q1b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 0;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q1b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 1;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q1b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 2;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q1b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 3;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });
    }
}