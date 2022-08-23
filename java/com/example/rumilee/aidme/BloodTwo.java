package com.example.rumilee.aidme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BloodTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_two);
    }

    public void openBeginOne (View view){
        Intent i = new Intent(this, BeginOne.class);
        startActivity(i);
    }

    public void openBloodOne (View view){
        Intent i = new Intent(this, BloodOne.class);
        startActivity(i);
    }
}
