package com.example.block08_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        float ratting = getIntent().getFloatExtra("the_rate", 0);

        TextView textView = (TextView) findViewById(R.id.textView);

        textView.setText("Welcome, your rate is " + ratting);
    }
}