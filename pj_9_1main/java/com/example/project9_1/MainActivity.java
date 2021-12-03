package com.example.project9_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
    }

    private static class MyGraphicView extends View {
        public MyGraphicView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();

            paint.setAntiAlias(true);
            paint.setColor(Color.GREEN);
            canvas.drawLine(10,10, 300,10, paint);

            paint.setStrokeWidth(5);
            paint.setColor(Color.BLUE);
            canvas.drawLine(10,30, 300,30, paint);

            paint.setStrokeWidth(0);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            Rect rect1 = new Rect(10, 50, 10 + 100, 50 + 50);
            canvas.drawRect(rect1, paint);



            paint.setStyle(Paint.Style.STROKE);
            Rect rect2 = new Rect(130, 50, 100 + 130, 50 + 100);
            canvas.drawRect(rect2, paint);

            RectF rect3 = new RectF(250,50, 250 + 100, 50 + 100);
            canvas.drawRoundRect(rect3, 20,20, paint);


            canvas.drawCircle(60, 220, 50, paint);

            paint.setStrokeWidth(5);
            Path path1 = new Path();
            path1.moveTo(10,290);
            path1.lineTo(10 + 50, 290 + 50);
            path1.lineTo(10 + 100, 290 );
            path1.lineTo(10 + 150, 290 + 50);
            path1.lineTo(10 + 200, 290);

            canvas.drawPath(path1,paint);

            paint.setStrokeWidth(0);
            paint.setTextSize(30);
            paint.setColor(Color.MAGENTA);
            canvas.drawText("안드로이드", 10, 390, paint);
        }
    }
}