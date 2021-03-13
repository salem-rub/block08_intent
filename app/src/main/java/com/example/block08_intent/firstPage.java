package com.example.block08_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class firstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

        Button button = (Button) findViewById(R.id.button);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rate = ratingBar.getRating();
                Toast.makeText(getApplicationContext(), "it is working your rate is " + rate, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(firstPage.this, secondPage.class);
                intent.putExtra("the_rate", rate);
                startActivity(intent);
                finish();

            }
        });
    }
}