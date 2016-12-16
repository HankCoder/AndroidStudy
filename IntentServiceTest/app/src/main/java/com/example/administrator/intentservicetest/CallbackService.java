package com.example.administrator.intentservicetest;

import android.app.IntentService;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2016/12/6 0006.
 */

public class CallbackService extends IntentService {



    public CallbackService() {
        super("defalut");
    }
    public CallbackService(String name) {
        super(name);
    }

    public void setProgressListener(OnProgressListener progressListener) {
        mProgressListener = progressListener;
    }
    public static final int MAX_PROGRESS = 100;
    private int progress = 0;
    private OnProgressListener mProgressListener;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new CallbackBinder();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        while (progress < MAX_PROGRESS) {
            progress +=5;
            if (mProgressListener != null) {
                mProgressListener.onProgress(progress);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        progress = 0;
    }

    public class CallbackBinder extends Binder {
        public CallbackService getService() {
            return CallbackService.this;
        }
    }
}
