package com.example.labtwo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    int curprog=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.progressbutton);
        ProgressBar progressbar=findViewById(R.id.loadbar);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Timer t=new Timer();
                TimerTask tt=new TimerTask() {
                    @Override
                    public void run() {
                        curprog+=5;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                progressbar.setProgress(curprog);
                                if(curprog==100){
                                    Log.e(" ",String.valueOf(curprog));
                                    t.cancel();
                                    curprog=0;
                                    showCompletionMessage();
                                }
                            }
                        });

                    }
                };
                //SystemClock.sleep(1000);
                t.schedule(tt,0,100);

            }
        });
    }
    private void showCompletionMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Process Completed!")
                .setTitle("PoP UP")
                .setNegativeButton("Close app",(dialog, which) -> {
                    finish();
                })
                .setPositiveButton("OK", null)
                .create()
                .show();
    }
}