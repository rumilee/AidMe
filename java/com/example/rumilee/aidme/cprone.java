package com.example.rumilee.aidme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cprone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprone);
    }
    public void openBeginOne(View view) {
        Intent i = new Intent(this, BeginOne.class);
        startActivity(i);
    }

    public void opencprtwo(View view) {
        Intent i = new Intent(this, cprtwo.class);
        startActivity(i);
    }
}
