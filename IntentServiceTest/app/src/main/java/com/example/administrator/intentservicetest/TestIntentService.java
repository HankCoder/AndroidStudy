package com.example.administrator.intentservicetest;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.format.DateFormat;
import android.util.Log;

/**
 * Created by Administrator on 2016/12/6 0006.
 */

public class TestIntentService extends IntentService {

    /*
    * Action
    */
    private static final String ACTION_RECV_MSG = "com.linc.intent.action.RECEIVE_MESSAGE";
    private static final String ACTION_OTHER_MSG = "com.linc.intent.action.OTHER_MESSAGE";

    /*
     * Message
     */
    private static final String MESSAGE_IN = "message_input";
    private static final String MESSAGE_OUT = "message_output";

    private final static String Tag = "---LincIntentService";

    public TestIntentService() {
        super("LincIntentService");
        Log.e(Tag, "Constructor");
        Log.e(Tag, "Constructor: " + Thread.currentThread().getName());
        setIntentRedelivery(true);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.e(Tag, "onBind()");
        return super.onBind(intent);
    }

    @Override
    public void onCreate() {
        Log.e(Tag, "onCreate()");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.e(Tag, "onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Log.e(Tag, "onStart()");
        super.onStart(intent, startId);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(Tag, "onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void setIntentRedelivery(boolean enabled) {
        Log.e(Tag, "setIntentRedelivery()");
        super.setIntentRedelivery(enabled);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.e(Tag, "onHandleIntent: " + Thread.currentThread().getName());
        Log.e(Tag, "LincIntentService is onHandleIntent!");
        String msgRecv = intent.getStringExtra(MESSAGE_IN);
        for (int i = 0; i < 1000; i++) {
            String resultTxt = msgRecv + " "
                    + DateFormat.format("MM/dd/yy hh:mm:ss", System.currentTimeMillis());
            Intent broadcastIntent = new Intent();
            broadcastIntent.setAction(ACTION_RECV_MSG);
            broadcastIntent.addCategory(Intent.CATEGORY_DEFAULT);
            broadcastIntent.putExtra(MESSAGE_OUT, resultTxt);
            sendBroadcast(broadcastIntent);
            SystemClock.sleep(10000);
        }

    }
}
