package com.example.thandiwe.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnswersActivity extends AppCompatActivity {

    Button btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        btn_exit =(Button)findViewById(R.id.btnExit);

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AnswersActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }


    public void Back2(View v)
    {
        Intent intent = new Intent(AnswersActivity.this,AnimalActivity.class);
        startActivity(intent);

    }
}
