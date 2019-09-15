package com.decima.lab.guessthename;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button showGuess;
    EditText editTextName;

    private final int REQUEST_CODE = 02;


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


                if (!name.isEmpty()) {
                    //                startActivity(new Intent(MainActivity.this, GuessName.class));

                    Intent intent = new Intent(MainActivity.this, GuessName.class);

                    intent.putExtra("guess", name);

                    //startActivity(intent);

                    startActivityForResult(intent, REQUEST_CODE);


                } else {
                    Toast.makeText(MainActivity.this, "Please Enter a Name!", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE) {

            assert data != null;
            String message = data.getStringExtra("message_back");
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }


    }
}
