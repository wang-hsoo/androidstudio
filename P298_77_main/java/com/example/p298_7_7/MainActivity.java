package com.example.p298_7_7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button1, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("배경색 바꾸기(긴 텍스트 메뉴)");

        baseLayout = (LinearLayout)findViewById(R.id.baseLayout);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        registerForContextMenu(button1);
        registerForContextMenu(button2);


    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater minflater = getMenuInflater();
        if (v == button1){
            menu.setHeaderTitle("배경색 변경");
            minflater.inflate(R.menu.menu1, menu);
        }
        if (v == button2){
            menu.setHeaderTitle("버튼 변경");
            minflater.inflate(R.menu.menu2, menu);
        }
    }


    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        super.onContextItemSelected(item);

        switch(item.getItemId()){
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;

            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;

            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;

            case R.id.subRotate:
                button2.setRotation(45);
                return true;

            case R.id.subSize:
                button2.setScaleX(2);
                button2.setScaleY(2);
                return true;
        }
        return false;
    }


    }
