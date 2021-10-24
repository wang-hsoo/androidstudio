package com.example.exec02_07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class p193_4_4 extends AppCompatActivity {
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
        setContentView(R.layout.p193);

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
                       img.setImageResource(R.drawable.r);
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
                img.setImageResource(R.drawable.q10);
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