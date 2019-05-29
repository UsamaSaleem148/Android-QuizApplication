package com.jackoftech.samdlabassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rd1, rd2, rd3, rd4;
    int res = 0;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnAns);

        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);
        rd3 = findViewById(R.id.rd3);
        rd4 = findViewById(R.id.rd4);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rd1.isChecked()){
                    res = 1;
                }
                else if (rd2.isChecked()){
                    res = 0;
                }
                else if (rd3.isChecked()){
                    res = 0;
                }
                else if (rd4.isChecked()){
                    res = 0;
                }

                Intent intent = new Intent(MainActivity.this, Q2.class);

                intent.putExtra("Ans", Integer.toString(res));

                startActivity(intent);
            }
        });

    }
}
