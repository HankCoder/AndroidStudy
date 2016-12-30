package com.example.administrator.viewselfdefine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.viewselfdefine.github.slideup.SlideUp;

public class Main3Activity extends AppCompatActivity {
    View slideView;
    SlideUp slideUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slideup_test);
        slideView = findViewById(R.id.text);

        slideUp = new SlideUp(slideView);
        slideUp.hideImmediately();

    }

    public void slideTest(View v) {
        slideUp.animateIn();
    }
}
