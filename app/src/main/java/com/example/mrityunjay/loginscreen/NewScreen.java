package com.example.mrityunjay.loginscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mrityunjay on 22-07-2017.
 */

public class NewScreen extends  AppCompatActivity {

    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_screen);

        msg = (TextView) findViewById(R.id.name);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            msg.setTextSize(50.00f);
            msg.setText("Welcome " + bundle.getString(MainActivity.NAME));
        }
    }
}