package com.example.p322_6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rbt;
    RadioButton img1, img2, img3, img4;
    Button btn1;
    TextView test;
    View dog, rabbit, horse, cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("연습문제 7-6");

        rbt = findViewById(R.id.rbt);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        btn1 = findViewById(R.id.btn1);
        test = findViewById(R.id.test);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dog = View.inflate(MainActivity.this, R.layout.dog, null);
                rabbit = View.inflate(MainActivity.this, R.layout.rabbit, null);
                horse = View.inflate(MainActivity.this, R.layout.horse, null);
                cat = View.inflate(MainActivity.this, R.layout.cat, null);


                switch (rbt.getCheckedRadioButtonId()) {
                    case R.id.img1:
                        AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);
                        dig.setTitle("강아지");
                        dig.setView(dog);
                        dig.setPositiveButton("확인", null);
                        dig.show();
                        break;

                    case R.id.img2:
                        AlertDialog.Builder dig1 = new AlertDialog.Builder(MainActivity.this);
                        dig1.setTitle("고양이");
                        dig1.setView(cat);
                        dig1.setPositiveButton("확인", null);
                        dig1.show();
                        break;



                    case R.id.img3:
                        AlertDialog.Builder dig2 = new AlertDialog.Builder(MainActivity.this);
                        dig2.setTitle("토끼");
                        dig2.setView(rabbit);
                        dig2.setPositiveButton("확인", null);
                        dig2.show();
                        break;


                    case R.id.img4:
                        AlertDialog.Builder dig3 = new AlertDialog.Builder(MainActivity.this);
                        dig3.setTitle("말");
                        dig3.setView(horse);
                        dig3.setPositiveButton("확인", null);
                        dig3.show();
                        break;


                }



            }
        });


    }
}