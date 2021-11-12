package com.example.p269;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUrl;
    Button btnGo, btnBack;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 웹 브라우저");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.web);


        edtUrl = (EditText)findViewById(R.id.edtUrl);
        btnGo = (Button)findViewById(R.id.btnGo);
        btnBack = (Button)findViewById(R.id.btnBack);
        web = (WebView) findViewById(R.id.webView1);

        web.setWebViewClient(new ShinguWebViewClient());
        WebSettings webset = web.getSettings();
        webset.setJavaScriptEnabled(true);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.loadUrl(edtUrl.getText().toString());
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.goBack();
            }
        });

    }

    class ShinguWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

}