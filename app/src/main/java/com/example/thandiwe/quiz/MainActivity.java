package com.example.thandiwe.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Music(View v)
    {
        Intent intent = new Intent(this, GeneralActivity.class);
        startActivity(intent);
    }
    public void Animals(View view)
    {
        Intent intent = new Intent(this, AnimalActivity.class);
        startActivity(intent);
    }
}
