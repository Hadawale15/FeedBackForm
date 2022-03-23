package com.example.feedbackform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.Rating_bar_id);
        button=findViewById(R.id.Submit_id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rate=String.valueOf(ratingBar.getRating());
                Toast.makeText(MainActivity.this, rate+"star", Toast.LENGTH_SHORT).show();
            }
        });
    }
}