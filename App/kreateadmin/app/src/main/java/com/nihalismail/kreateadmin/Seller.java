package com.nihalismail.kreateadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Seller extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller);

        editText = findViewById(R.id.editText);
    }

    public void moveToAgent(View view)
    {
        Intent intent = new Intent(this,Agent.class);
        intent.putExtra("seller",editText.getText().toString());
        startActivity(intent);
    }
}
