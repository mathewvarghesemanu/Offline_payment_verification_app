package com.nihalismail.kreateadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Agent extends AppCompatActivity {

    String sellerName,agentName;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent);

        //Get seller name
        Bundle bundle = getIntent().getExtras();
        sellerName = bundle.getString("seller");

        editText=findViewById(R.id.editText);
    }

    public void moveToConfirm(View view)
    {
        agentName = editText.getText().toString();
        Intent intent = new Intent(this,Confirm.class);
        intent.putExtra("seller",sellerName);
        intent.putExtra("agent",agentName);
        startActivity(intent);
    }
}
