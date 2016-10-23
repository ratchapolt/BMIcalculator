package com.example.bmicalculator;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class showresult extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showresult);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    TextView tv1 = (TextView) findViewById(R.id.tv1);
    TextView tv2 = (TextView) findViewById(R.id.tv2);
    String bmi = getIntent().getStringExtra("bmi");

    {
        if (bmi >= 30)

        {
            tv1 = Double.toString(bmi);
            String tv2 = "น้ำหนักมากกว่าปกติมาก(อ้วน)";
        } else {
            if (bmi >= 25)

            {
                tv1 = Double.toString(bmi);
                String tv2 = "น้ำหนักมากกว่าปกติ(ท้วม)";
            } else if (bmi >= 18.5)

            {
                tv1 = Double.toString(bmi);
                String tv2 = "น้ำหนักปกติ";
            } else

            {
                tv1 = Double.toString(bmi);
                String tv2 = "น้ำหนักน้อยกว่าปกติ(ผอม)";
            }
        }

    }
}
