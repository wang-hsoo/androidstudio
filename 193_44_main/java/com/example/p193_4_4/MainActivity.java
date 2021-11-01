package com.example.p193_4_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch strbtn;
    Button end, reset;
    TextView selTxt;
    RadioGroup rdg;
    RadioButton btn1, btn2, btn3;
    ImageView img;
    LinearLayout conLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strbtn = (Switch)findViewById(R.id.strbtn);
        end = (Button)findViewById(R.id.end);
        reset = (Button)findViewById(R.id.reset);
        selTxt = (TextView)findViewById(R.id.selTxt);
        rdg = (RadioGroup)findViewById(R.id.rdG);
        btn1 = (RadioButton)findViewById(R.id.btn1);
        btn2 = (RadioButton)findViewById(R.id.btn2);
        btn3 = (RadioButton)findViewById(R.id.btn3);
        img = (ImageView)findViewById(R.id.img);
        conLayout = (LinearLayout)findViewById(R.id.conLayout);




        strbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conLayout.getVisibility() == View.INVISIBLE){
                conLayout.setVisibility(View.VISIBLE);
            }else{
                conLayout.setVisibility(View.INVISIBLE);
            }
        }
        });


       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                       img.setImageResource(R.drawable.pie);
               }
           });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.q10);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.r11);
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        }
    }