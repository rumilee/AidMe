package com.example.rumilee.aidme;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BeginTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_two);
    }

    public void openHomePage(View view){
        Intent i = new Intent(this, MainActivity_HomePage.class);
        startActivity(i);
    }

    public void openBeginOne(View view){
        Intent i = new Intent(this, BeginOne.class);
        startActivity(i);
    }

    public void openFracture(View view){
        Intent i = new Intent(this, fractureone.class);
        startActivity(i);
    }

    public void openFrostbite(View view){
        Intent i = new Intent(this, frostbite.class);
        startActivity(i);
    }

    public void openStings(View view){
        Intent i = new Intent(this, stingsone.class);
        startActivity(i);
    }

    public void openStroke(View view){
        Intent i = new Intent(this, stroke.class);
        startActivity(i);
    }

    public void callIntent(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:911"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(callIntent);
    }
}
