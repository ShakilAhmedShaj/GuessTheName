package com.decima.lab.guessthename;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GuessName extends AppCompatActivity {

    TextView textViewReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_name);

        Bundle extraData = getIntent().getExtras();

        textViewReceived = findViewById(R.id.text_view_received);


        if (extraData != null) {

            textViewReceived.setText("Hi " + extraData.getString("guess") + "!");
        }


        textViewReceived.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                intent.putExtra("message_back", "Hi from Guess Activity");
                setResult(RESULT_OK, intent);
                finish();

            }
        });


    }
}
