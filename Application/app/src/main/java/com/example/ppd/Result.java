package com.example.ppd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView resultText,result;
    ImageView imageEmo;
    Button btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        int score = intent.getIntExtra(QuestionSix.EXTRA_YOUR_KEY,0);
        //int score = 5;
        //setContentView(R.layout.activity_result);
        int finalResult = (score*100)/18;
        System.out.println(finalResult);
        resultText = (TextView) findViewById(R.id.resultText);
        result = (TextView) findViewById(R.id.result);
        resultText.setText(""+finalResult+"%");
        imageEmo = (ImageView) findViewById(R.id.imageEmo);
        btnHome = (Button) findViewById(R.id.btnHome);
        if (finalResult < 27){
            result.setText("No Depression Detected");
            imageEmo.setImageResource(R.drawable.happy);
        }if (finalResult < 37){
            result.setText("Possible Chance of Depression");
            imageEmo.setImageResource(R.drawable.sad);
        }if (finalResult < 44){
            result.setText("High Possiblility of Depression");
            imageEmo.setImageResource(R.drawable.sad);
        }else{
            result.setText("Depression Detected");
            imageEmo.setImageResource(R.drawable.sad);
        }

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}