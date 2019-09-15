package com.decima.lab.guessthename;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button showGuess;
    EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showGuess = findViewById(R.id.button_guess);
        editTextName = findViewById(R.id.edit_text_name);


        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editTextName.getText().toString().trim();

//                startActivity(new Intent(MainActivity.this, GuessName.class));

                Intent intent = new Intent(MainActivity.this, GuessName.class);

                intent.putExtra("guess", name);

                startActivity(intent);
            }
        });


    }
}
