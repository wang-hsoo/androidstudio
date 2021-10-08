package com.example.progiect_4_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRemain;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");

        edit1 =(EditText)findViewById(R.id.edit1);
        edit2 =(EditText)findViewById(R.id.edit2);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnRemain = (Button)findViewById(R.id.btnRemain);
        textResult = (TextView)findViewById(R.id.textResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if ( num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "공백부분을 입력해주세요!", Toast.LENGTH_SHORT).show();
                }else{
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과: " + result.toString());
                }
                return false;
            }
        });


        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if ( num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "공백부분을 입력해주세요!", Toast.LENGTH_SHORT).show();
                }else{
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과: " + result.toString());
                }
                return false;
            }
        });


        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if ( num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "공백부분을 입력해주세요!", Toast.LENGTH_SHORT).show();
                }else{
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과: " + result.toString());
                }
                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if ( num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "공백부분을 입력해주세요!", Toast.LENGTH_SHORT).show();
                }else if (num2.trim().equals("0")){
                    Toast.makeText(getApplicationContext(), "0제외한 다른 숫자를 입력해주세요!", Toast.LENGTH_SHORT).show();
                }else{
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    String strNumer = String.format("%.2f",result);
                    textResult.setText("계산 결과: " + strNumer);
                }
                return false;
            }
        });


        btnRemain.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if ( num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "공백부분을 입력해주세요!", Toast.LENGTH_SHORT).show();
                }else if (num2.trim().equals("0")){
                    Toast.makeText(getApplicationContext(), "0제외한 다른 숫자를 입력해주세요!", Toast.LENGTH_SHORT).show();
                }else{
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    String strNumer = String.format("%.2f",result);
                    textResult.setText("계산 결과: " + strNumer);
                }
                return false;
            }
        });




    }
}