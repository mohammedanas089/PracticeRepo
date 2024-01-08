package com.example.labtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv =findViewById(R.id.textView2);
        TextView pass =findViewById(R.id.textView3);

        String welcomemessage ="Name : "+ getIntent().getStringExtra("mail");
        tv.setText(welcomemessage);
        pass.setText("Passoword : "+getIntent().getStringExtra("pass"));

    }
}