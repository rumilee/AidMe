package com.example.rumilee.aidme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class stingsone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stingsone);
    }

    public void openBeginTwo(View view) {
        Intent i = new Intent(this, BeginTwo.class);
        startActivity(i);
    }

    public void openStingsTwo(View view) {
        Intent i = new Intent(this, stingstwo.class);
        startActivity(i);
    }
}
