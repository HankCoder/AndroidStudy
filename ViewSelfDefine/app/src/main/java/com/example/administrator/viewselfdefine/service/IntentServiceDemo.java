package com.example.administrator.viewselfdefine.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Administrator on 2016/12/16 0016.
 */

public class IntentServiceDemo extends IntentService {

    private static final String TAG = IntentServiceDemo.class.getSimpleName();
    public IntentServiceDemo() {
        super(TAG);
    }

    @Override
    public void onCreate() {
        Log.e(TAG, "onCreate");
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e(TAG, "onBind");
        return super.onBind(intent);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(TAG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.e(TAG, "onHandleIntent: " + Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "onDestroy");
        super.onDestroy();
    }
}
