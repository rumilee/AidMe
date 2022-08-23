package com.example.rumilee.aidme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity_HomePage extends AppCompatActivity {

    int myKitRequestCode = 1;

    boolean tweezersState = false;
    boolean safetyPinsState = false;
    boolean scissorsState = false;
    boolean coldPackState = false;
    boolean sterileGlovesState = false;
    boolean firstAidManualState = false;
    boolean gauzeState = false;
    boolean wipesState = false;
    boolean bandaidsState = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__home_page);

    }

    public void openBeginOne(View view){
        Intent i = new Intent(this, BeginOne.class);
        startActivity(i);

    }

    public void openMyKit(View view){
        Intent i = new Intent(this, mykit.class);

        // Put all state variables in extras
        i.putExtra("TWEEZER", tweezersState);
        i.putExtra("SAFETYPINS", safetyPinsState);
        i.putExtra("SCISSOR", scissorsState);
        i.putExtra("COLDPACK", coldPackState);
        i.putExtra("STERILEGLOVES", sterileGlovesState);
        i.putExtra("FIRSTAIDMANUAL", firstAidManualState);
        i.putExtra("GAUZE", gauzeState);
        i.putExtra("WIPES", wipesState);
        i.putExtra("BANDAIDS", bandaidsState);

        startActivityForResult(i, myKitRequestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Bundle values;

        if (requestCode == myKitRequestCode) {
            if(resultCode == Activity.RESULT_OK){
                values = data.getExtras();
                tweezersState = values.getBoolean("TWEEZER");
                safetyPinsState = values.getBoolean("SAFETYPINS");
                scissorsState = values.getBoolean("SCISSOR");
                coldPackState = values.getBoolean("COLDPACK");
                sterileGlovesState = values.getBoolean("STERILEGLOVES");
                firstAidManualState = values.getBoolean("FIRSTAIDMANUAL");
                gauzeState = values.getBoolean("GAUZE");
                wipesState = values.getBoolean("WIPES");
                bandaidsState = values.getBoolean("BANDAIDS");

            }
        }
    }//onActivityResult
}
