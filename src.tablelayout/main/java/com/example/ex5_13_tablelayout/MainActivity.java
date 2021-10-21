package com.example.ex5_13_tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText Edit1, Edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView TextResult;
    String num1, num2;
    Integer result;
    Button[] btnNum = new Button[10];
    Integer[] numBtnIds = {R.id.btnNum0, R.id.btnNum1, R.id.btnNum2, R.id.btnNum3, R.id.btnNum4, R.id.btnNum5, R.id.btnNum6, R.id.btnNum7, R.id.btnNum8, R.id.btnNum9};
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("테이블 레이아웃 계산기");

        Edit1 = (EditText)findViewById(R.id.Edit1);
        Edit2 = (EditText)findViewById(R.id.Edit2);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        TextResult = (TextView)findViewById(R.id.TextResult);

        for ( i = 0; i < numBtnIds.length; i++){
            btnNum[i] = (Button)findViewById(numBtnIds[i]);
        }

        for(i = 0; i < numBtnIds.length; i++){
            int index;
            index = i;

            btnNum[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Edit1.isFocused() == true){
                        num1 = Edit1.getText().toString() + btnNum[index].getText().toString();
                        Edit1.setText(num1);
                    }else if (Edit2.isFocused() == true){
                        num2 = Edit2.getText().toString() + btnNum[index].getText().toString();
                        Edit2.setText(num2);
                    }else {
                        Toast.makeText(getApplicationContext(), "먼저 에디트텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();

                result = Integer.parseInt(num1) + Integer.parseInt(num2);

                TextResult.setText("계산결과: " + result.toString());
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();

                result = Integer.parseInt(num1) - Integer.parseInt(num2);

                TextResult.setText("계산결과: " + result.toString());
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();

                result = Integer.parseInt(num1) * Integer.parseInt(num2);

                TextResult.setText("계산결과: " + result.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();

                result = Integer.parseInt(num1) / Integer.parseInt(num2);


                TextResult.setText("계산결과: " + result);
            }
        });




    }
}