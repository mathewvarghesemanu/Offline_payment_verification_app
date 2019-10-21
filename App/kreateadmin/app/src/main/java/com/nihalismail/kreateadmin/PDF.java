package com.nihalismail.kreateadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class PDF extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        pdfView = findViewById(R.id.pdfView);
        Bundle bundle = getIntent().getExtras();
        String uri = bundle.getString("pdf");
        Log.i("Superman",uri);
        Uri pdfUri = Uri.parse(uri);
        pdfView.fromUri(pdfUri).load();
    }

    public void moveToNextActivity(View view)
    {
        Intent intent = new Intent(this,Invoice.class);
        startActivity(intent);
    }
}
