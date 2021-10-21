package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5;
    EditText number1, number2;
    String num1, num2;
    Integer rlt;
    Double drlt;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        result = (TextView)findViewById(R.id.result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"숫자를 입력해주세요!", Toast.LENGTH_SHORT).show();
                } else{
                    rlt = parseInt(num1) + parseInt(num2);
                    result.setText("결과: " + rlt.toString());
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"숫자를 입력해주세요!", Toast.LENGTH_SHORT).show();
                } else{
                    rlt = parseInt(num1) - parseInt(num2);
                    result.setText("결과: " + rlt.toString());
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"숫자를 입력해주세요!", Toast.LENGTH_SHORT).show();
                } else{
                    rlt = parseInt(num1) * parseInt(num2);
                    result.setText("결과: " + rlt.toString());
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"숫자를 입력해주세요!", Toast.LENGTH_SHORT).show();
                }else if( parseInt(num2) == 0){
                    Toast.makeText(getApplicationContext(),"0이 아닌 다른 수로 나눠주세요!", Toast.LENGTH_SHORT).show();
                } else{
                    drlt = parseDouble(num1) / parseDouble(num2);
                    String dap = String.format("%.2f", drlt);
                    result.setText("결과: " + dap);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"숫자를 입력해주세요!", Toast.LENGTH_SHORT).show();
                }else if( parseInt(num2) == 0){
                    Toast.makeText(getApplicationContext(),"0이 아닌 다른 수로 나눠주세요!", Toast.LENGTH_SHORT).show();
                } else{
                    rlt = parseInt(num1) % parseInt(num2);
                    result.setText("결과: " + rlt.toString());
                }
            }
        });


    }
}