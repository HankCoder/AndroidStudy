package com.example.administrator.viewselfdefine;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.administrator.viewselfdefine.data.PieData;
import com.example.administrator.viewselfdefine.view.PieView;
import com.example.administrator.viewselfdefine.view.TestView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        mLayout = (LinearLayout) findViewById(R.id.activity_main);
        mLayout.setBackgroundColor(Color.WHITE);

//        testPieView();
        testTestView();

    }

    public void testTestView() {
        final TestView testView = new TestView(MainActivity.this);
        testView.setMinimumHeight(700);
        testView.setMinimumWidth(500);
        testView.setLayoutParams(
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.FILL_PARENT,
                        ViewGroup.LayoutParams.FILL_PARENT));
        testView.invalidate();
        mLayout.addView(testView);
    }

    public void testPieView() {
        final PieView pieView = new PieView(MainActivity.this);
        pieView.setData(getPieData());
        pieView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        pieView.invalidate();
        mLayout.addView(pieView);
    }

    public ArrayList<PieData> getPieData() {
        ArrayList<PieData> tmp = new ArrayList<PieData>();

        for (int i = 1; i < 6; i++) {
            PieData pieData = new PieData(PieData.class.getSimpleName().toString() + i, i * 10);
            tmp.add(pieData);
        }

        return tmp;
    }
}
