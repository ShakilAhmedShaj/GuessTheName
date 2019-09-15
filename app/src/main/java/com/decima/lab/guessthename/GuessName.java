package com.decima.lab.guessthename;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GuessName extends AppCompatActivity {

    TextView textViewReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_name);

        textViewReceived = findViewById(R.id.text_view_received);


        if (getIntent().getStringExtra("guess") != null) {

            textViewReceived.setText(getIntent().getStringExtra("guess"));
        }


    }
}
