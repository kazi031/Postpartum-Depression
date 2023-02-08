package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionFive extends AppCompatActivity {
    Button q5b1,q5b2,q5b3,q5b4;
    public static final String EXTRA_YOUR_KEY = "EXTRA_YOUR_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five);
        Intent intent = getIntent();
        int scorePrev = intent.getIntExtra(SceneFive.EXTRA_YOUR_KEY,0);
        System.out.println(scorePrev);
        q5b1 = (Button) findViewById(R.id.q5b1);
        q5b2 = (Button) findViewById(R.id.q5b2);
        q5b3 = (Button) findViewById(R.id.q5b3);
        q5b4 = (Button) findViewById(R.id.q5b4);

        Intent newIntent = new Intent(QuestionFive.this, SceneSix.class);

        q5b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+0;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q5b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+1;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q5b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = scorePrev+2;
                newIntent.putExtra(EXTRA_YOUR_KEY, score);
                startActivity(newIntent);
                finish();
            }
        });

        q5b4.setOnClickListener(new View.OnClickListener() {
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