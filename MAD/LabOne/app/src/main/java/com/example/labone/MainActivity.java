package com.example.labone;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton button = findViewById(R.id.button);
        Switch switchButton = findViewById(R.id.switch1);
        ConstraintLayout layout=findViewById(R.id.mylayout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Button Pressed");
            }
        }) ;

        switchButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            button.setEnabled(isChecked);
            showToast(isChecked ? "Button Enabled" : "Button Disabled");
        });

        TextView comment=new TextView(this);
        comment.setText("This is a TextView Generated at runtime.\nThe Button changes image based on state dynamically. \nSwitch is used to disable the button");
        ConstraintLayout.LayoutParams param=new ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
        );
        param.setMargins(100,1000, 0, 0);
        layout.addView(comment,param);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
