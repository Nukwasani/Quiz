package com.example.thandiwe.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Answers2Activity extends AppCompatActivity {


    Button btn_exit, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers2);

        btn_exit =(Button)findViewById(R.id.btnExit);
        btn_back =(Button)findViewById(R.id.btnBack);


    }


    public void Back(View v)
    {
        Intent intent = new Intent(this,GeneralActivity.class);
        startActivity(intent);
    }

    public void Exit(View v)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
