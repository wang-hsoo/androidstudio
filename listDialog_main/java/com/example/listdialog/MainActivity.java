package com.example.listdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] versionArray = new String[]{"오레오", "파이", "Q(10)", "R(11)"};
                boolean[] chechArray = new boolean[]{true, false, false, false};
                AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);
                dig.setTitle("좋아하는 안드로이드 버전은?");

                dig.setIcon(R.mipmap.ic_launcher);

                dig.setMultiChoiceItems(versionArray, chechArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i, boolean b) {
                        button1.setText(versionArray[i]);
                    }
                });

                dig.setPositiveButton("닫기", null);
                dig.show();
            }
        });
    }
}