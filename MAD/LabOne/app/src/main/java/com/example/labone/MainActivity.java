package com.example.labone;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        Switch switchButton = findViewById(R.id.switch1);
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        showToast("Button Pressed");
                        break;
                    case MotionEvent.ACTION_UP:
                        showToast("Button Released");
                        break;
                }
                return false;
            }
        });

        switchButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            button.setEnabled(isChecked);
            textView.setVisibility(isChecked ? View.VISIBLE : View.INVISIBLE);
            showToast(isChecked ? "Button Enabled" : "Button Disabled");
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
