package com.nihalismail.kreateadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Confirm extends AppCompatActivity {

    String sellerName,agentName;
    TextView finalText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

       //Get seller name and agent name
        Bundle bundle = getIntent().getExtras();
        sellerName = bundle.getString("seller");
        agentName = bundle.getString("agent");

        finalText = findViewById(R.id.finalText);
        finalText.setText("Agent "+agentName+" is assigned to seller "+sellerName);

        //Countdown timer
        new CountDownTimer(6000, 1000) {

            public void onTick(long millisUntilFinished) {

                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                Intent intent = new Intent(Confirm.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }

        }.start();
    }
}
