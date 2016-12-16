package com.example.administrator.viewselfdefine.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2016/12/6 0006.
 */

public class TestView extends View {

    private Paint mPaint = new Paint();
    private int mWith;
    private int mHeight;

    public TestView(Context context) {
        super(context);
        initPaint();
    }

    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void initPaint() {
        mPaint.setColor(Color.BLACK);//设置画笔颜色
        mPaint.setStyle(Paint.Style.FILL);//设置画笔模式为填充
        mPaint.setStrokeWidth(10f);//设置画笔宽度为10px
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWith = w;
        mHeight = h;
        Log.e("TestView", "w: " + w);
        Log.e("TestView", "h: " + h);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawColor(Color.BLUE);
//        canvas.drawPoint(200, 200, mPaint);
//        canvas.drawPoints(new float[]{          //绘制一组点，坐标位置由float数组指定
//                500,500,
//                500,600,
//                500,700
//        },mPaint);
//        canvas.drawLine(300, 300, 400, 400, mPaint);
//        canvas.drawLines(new float[] {
//                100, 200, 300, 400,
//                100, 300, 400, 399
//        }, mPaint);

//        canvas.drawRect(100, 100, 800, 400, mPaint);
//        Rect rect = new Rect(100, 450, 800, 750);
//        canvas.drawRect(rect, mPaint);
//
//        RectF rectF = new RectF(100, 800, 800, 1100);
//        canvas.drawRect(rectF, mPaint);
//        RectF rectF = new RectF(100, 450, 800, 750);
//        canvas.drawRoundRect(rectF, 30, 30, mPaint);
//        RectF rectf = new RectF(100, 100, 800, 400);
//
//        mPaint.setColor(Color.GRAY);
//        canvas.drawRect(rectf, mPaint);
//
//        mPaint.setColor(Color.BLUE);
//        canvas.drawRoundRect(rectf, 700, 400, mPaint);
//        RectF rectF = new RectF(100, 100, 800, 400);
//        canvas.drawOval(rectF, mPaint);
//        canvas.drawCircle(500, 500, 400, mPaint);
//        RectF rectF = new RectF(100, 100, 800, 400);
//        mPaint.setColor(Color.GRAY);
//        canvas.drawRect(rectF, mPaint);
//
//        mPaint.setColor(Color.BLUE);
//        canvas.drawArc(rectF, 0, 270, true, mPaint);

//        mPaint.setColor(Color.BLUE);
//        mPaint.setStrokeWidth(40);
//
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.drawCircle(200,200,100,mPaint);
//
//        // 填充
//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawCircle(200,500,100,mPaint);
//
//        // 描边加填充
//        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
//        canvas.drawCircle(200, 800, 100, mPaint);
//        mPaint.setColor(Color.BLUE);
//        canvas.translate(200, 200);
//        canvas.drawCircle(0, 0, 100, mPaint);
//
//        mPaint.setColor(Color.RED);
//        canvas.translate(200, 200);
//        canvas.drawCircle(0, 0, 100, mPaint);

//        canvas.translate(mWith / 2, mHeight / 2);
//        RectF rectF = new RectF(-400, -400, 400, 400);
//
//        mPaint.setColor(Color.BLUE);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeWidth(10);
//        for (int i = 0; i < 20; i++) {
//            canvas.scale(0.9f, 0.9f);
//            canvas.drawRect(rectF, mPaint);
//        }
//        canvas.translate(getWidth() / 2, getHeight() / 2);
//        RectF rectF = new RectF(0, -400, 400, 0);
//
//        mPaint.setColor(Color.BLACK);
//        canvas.drawRect(rectF, mPaint);
//        canvas.rotate(180);
//
//        mPaint.setColor(Color.RED);
//        canvas.drawRect(rectF, mPaint);

        canvas.translate(getWidth() / 2, getHeight() / 2);
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5);
        canvas.drawCircle(0, 0, 400, mPaint);
        canvas.drawCircle(0, 0, 380, mPaint);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(5);
        for (int i = 0; i <= 360; i += 10) {
            canvas.drawLine(0, 380, 0, 400, mPaint);
            canvas.rotate(10);
        }
    }


}
