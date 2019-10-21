package com.nihalismail.kreateadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Invoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);
    }

    public void moveToSeller(View view)
    {
        Intent intent = new Intent(this,Seller.class);
        startActivity(intent);
    }
}
