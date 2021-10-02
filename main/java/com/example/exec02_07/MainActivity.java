package com.example.exec02_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edit1;
    Button btnToast, btnHompage;
    RadioButton rdoQ10, rdoR11;
    ImageView ivAndroid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("좀 그럴듯한 앱");

        edit1 = (EditText) findViewById(R.id.edit1);

        btnToast = (Button) findViewById(R.id.btnToast);

        btnHompage = (Button) findViewById(R.id.homepage);

        rdoQ10 = (RadioButton) findViewById(R.id.ridoQ10);

        rdoR11 = (RadioButton) findViewById(R.id.ridoR11);

        ivAndroid = (ImageView) findViewById(R.id.ivAndroid);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.length() == 0){
                    Toast.makeText(getApplicationContext(), "공백부분을 입력해주세요!", Toast.LENGTH_SHORT).show();
                }else{
                Toast.makeText(getApplicationContext(), edit1.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        String dummyText;


            btnHompage.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    if(edit1.length() == 0){
                        Toast.makeText(getApplicationContext(), "공백부분을 입력해주세요!", Toast.LENGTH_SHORT).show();
                    }else {
                        Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit1.getText().toString()));
                        startActivity(mintent);
                    }
                }
            });


        rdoQ10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ivAndroid.setImageResource(R.drawable.q10);
            }
        });

        rdoR11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivAndroid.setImageResource(R.drawable.r);
            }
        });
    }
}