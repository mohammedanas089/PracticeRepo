package com.example.labtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText mail=findViewById(R.id.editTextTextEmailAddress);
        EditText pass=findViewById(R.id.editTextTextPassword);
        Button moveToSecondActivityButton = findViewById(R.id.button);

        moveToSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to execute when the button is clicked
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("mail",mail.getText().toString());
                intent.putExtra("pass",pass.getText().toString());
                startActivity(intent);
            }
        });
    }
}