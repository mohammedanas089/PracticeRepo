package com.example.labsix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText msg,mob;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg=findViewById(R.id.msg);
        mob=findViewById(R.id.mob);
        btn=findViewById(R.id.smsbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    requestPermission();
                    SmsManager smsm=SmsManager.getDefault();
                    smsm.sendTextMessage(mob.getText().toString(),null,msg.getText().toString(),null,null);
                    Toast.makeText(MainActivity.this,"SMS Sent Successfully",Toast.LENGTH_SHORT).show();

                }
                catch (Exception e){
                    Log.i("INFO LOG",e.toString());
                    Toast.makeText(MainActivity.this,"Error Sending SMS",Toast.LENGTH_SHORT).show();

                }
            }
        });

        
    }

    //Extra fitting method, not necessary for lab
    private void requestPermission() {
        String permissionStr = "android.permission.SEND_SMS";

        if (ContextCompat.checkSelfPermission(this, permissionStr) != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, new String[]{permissionStr}, 1);
    }
}