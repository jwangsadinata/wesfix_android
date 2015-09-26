package edu.wesleyan.wesfix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etName = (EditText) findViewById(R.id.etName);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startSec = new Intent();
                startSec.setClass(MainActivity.this, ThanksActivity.class);
                startActivity(startSec);

                finish();
            }
        });

        addListenerOnSpinnerItemSelection();
    }

    public void addListenerOnSpinnerItemSelection(){

        Spinner feedbackSpinner = (Spinner) findViewById(R.id.etBuilding);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.buildingList, R.layout.spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        feedbackSpinner.setAdapter(adapter);
    }

}
