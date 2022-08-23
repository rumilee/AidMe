package com.example.rumilee.aidme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class mykit extends AppCompatActivity {

    Bundle values;

    // Link all UI elements
    ToggleButton tweezerId;
    ToggleButton safetyPinsId;
    ToggleButton scissorsId;
    ToggleButton coldPackId;
    ToggleButton sterileGlovesId;
    ToggleButton firstAidManualId;
    ToggleButton gauzeId;
    ToggleButton wipesId;
    ToggleButton bandaidsId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mykit);

        // Collect values passed from main activity
        values = getIntent().getExtras();

        // Finding all UI elements by ID
        tweezerId = (ToggleButton) findViewById(R.id.tweezers);
        safetyPinsId = (ToggleButton) findViewById(R.id.safetypins);
        scissorsId = (ToggleButton) findViewById(R.id.scissors);
        coldPackId = (ToggleButton) findViewById(R.id.coldpack);
        sterileGlovesId = (ToggleButton) findViewById(R.id.gloves);
        firstAidManualId = (ToggleButton) findViewById(R.id.firstaid);
        gauzeId = (ToggleButton) findViewById(R.id.gauze);
        wipesId = (ToggleButton) findViewById(R.id.wipes);
        bandaidsId = (ToggleButton) findViewById(R.id.bandaids);

        // Set all UI elements to the values collected from the main activity
        tweezerId.setChecked(values.getBoolean("TWEEZER"));
        safetyPinsId.setChecked(values.getBoolean("SAFETYPINS"));
        scissorsId.setChecked(values.getBoolean("SCISSOR"));
        coldPackId.setChecked(values.getBoolean("COLDPACK"));
        sterileGlovesId.setChecked(values.getBoolean("STERILEGLOVES"));
        gauzeId.setChecked(values.getBoolean("GAUZE"));
        firstAidManualId.setChecked(values.getBoolean("FIRSTAIDMANUAL"));
        wipesId.setChecked(values.getBoolean("WIPES"));
        bandaidsId.setChecked(values.getBoolean("BANDAIDS"));


    }

    public void onBackButtonClick(View view) {
        // Pass back UI values (checked or not checked)
        Intent returnIntent = new Intent();

        // Collect all user input
        returnIntent.putExtra("TWEEZER",tweezerId.isChecked());
        returnIntent.putExtra("SAFETYPINS",safetyPinsId.isChecked());
        returnIntent.putExtra("SCISSOR",scissorsId.isChecked());
        returnIntent.putExtra("COLDPACK",coldPackId.isChecked());
        returnIntent.putExtra("STERILEGLOVES",sterileGlovesId.isChecked());
        returnIntent.putExtra("GAUZE",gauzeId.isChecked());
        returnIntent.putExtra("FIRSTAIDMANUAL",firstAidManualId.isChecked());
        returnIntent.putExtra("WIPES",wipesId.isChecked());
        returnIntent.putExtra("BANDAIDS",bandaidsId.isChecked());



        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}
