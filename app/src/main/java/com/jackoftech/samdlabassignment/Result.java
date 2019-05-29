package com.jackoftech.samdlabassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Result extends AppCompatActivity {
    String message;

    Integer alpha;

    TextView txt, txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txt = findViewById(R.id.txt);

        txt1 = findViewById(R.id.txt1);

        Intent intent = getIntent();
        message = intent.getStringExtra("Ans");

        alpha = Integer.parseInt(message);

        if (alpha >=5){
            txt.setText("Congratulation ! You have passed your Exam.");
            txt1.setText("Your result is = "+alpha+" / 10");
        }
        else if (alpha < 5){
            txt.setText("Try next time");
            txt1.setText("Your result is = "+alpha+" / 10");
        }
    }
}
