package com.example.rumilee.aidme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BurnsOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burns_one);
    }


    public void openBeginOne(View view) {
        Intent i = new Intent(this, BeginOne.class);
        startActivity(i);
    }

    public void openBurnsTwo(View view) {
        Intent i = new Intent(this, BurnsTwo.class);
        startActivity(i);
    }
}
