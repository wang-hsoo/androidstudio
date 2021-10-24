package com.example.exec02_07;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class basic extends AppCompatActivity {

    Button btnShingu, btn119, btnGal, btnEnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic);

        btnShingu = (Button)findViewById(R.id.btnShingu);

        btn119 = (Button)findViewById(R.id.btn119);

        btnGal = (Button)findViewById(R.id.btnGal);

        btnEnd = (Button)findViewById(R.id.btnEnd);

        btnShingu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://shingu.ac.kr"));
                startActivity(mintent);
            }
        });

        btn119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/119"));
                startActivity(mintent);
            }
        });

        btnGal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mintent);
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

