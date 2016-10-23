package com.example.bmicalculator;

import android.content.DialogInterface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {


    private GoogleApiClient client;
    private EditText txtheight;
    private EditText txtweight;
    private Button calBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void initControls() {
        txtheight = (EditText)findViewById(R.id.txtheight);
        txtweight = (EditText)findViewById(R.id.txtweight);
        calBtn = (Button)findViewById(R.id.calBtn);
        calBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick (View v){ calculate(); }});
    }


    private void calculate()    {
        double txtheight = Double.parseDouble(txtheight.getText().toString());
        double txtweight = Double.parseDouble(txtweight.getText().toString());
        double bmi = txtweight / ((txtheight/100)*(txtheight/100));
    }


}
