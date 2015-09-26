package edu.wesleyan.wesfix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ThanksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);

        Button btnReportAnother = (Button) findViewById(R.id.btnReportAnother);

        btnReportAnother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startSec = new Intent();
                startSec.setClass(ThanksActivity.this, MainActivity.class);
                startActivity(startSec);

                finish();
            }
        });


    }
}
