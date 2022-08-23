package com.example.rumilee.aidme;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BeginOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_one);
    }

    public void openHomePage(View view) {
        Intent i = new Intent(this, MainActivity_HomePage.class);
        startActivity(i);
    }

    public void openBeginTwo(View view) {
        Intent i = new Intent(this, BeginTwo.class);
        startActivity(i);
    }

    public void openBloodOne(View view) {
        Intent i = new Intent(this, BloodOne.class);
        startActivity(i);
    }

    public void openBurnsOne(View view) {
        Intent i = new Intent(this, BurnsOne.class);
        startActivity(i);
    }

    public void opencprone(View view) {
        Intent i = new Intent(this, cprone.class);
        startActivity(i);
    }

    public void openFainting(View view) {
        Intent i = new Intent(this, Fainting.class);
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
