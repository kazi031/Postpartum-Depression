package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionFour extends AppCompatActivity {
    Button q4b1,q4b2,q4b3,q4b4;
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);
        Intent intent = getIntent();
        int scorePrev = intent.getIntExtra(SceneFour.EXTRA_YOUR_KEY,0);
        System.out.println(scorePrev);
        q4b1 = (Button) findViewById(R.id.q4b1);
        q4b2 = (Button) findViewById(R.id.q4b2);
        q4b3 = (Button) findViewById(R.id.q4b3);
        q4b4 = (Button) findViewById(R.id.q4b4);

        Intent newIntent = new Intent(QuestionFour.this, SceneFive.class);

        q4b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+0;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q4b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+1;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q4b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+2;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q4b4.setOnClickListener(new View.OnClickListener() {
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