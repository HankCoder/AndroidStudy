package com.example.administrator.viewselfdefine.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.viewselfdefine.R;

public class TestIntentServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_intent_service);
    }

    public void OnTestService(View v) {

        startService(new Intent(getApplicationContext(), IntentServiceDemo.class));
    }
}
