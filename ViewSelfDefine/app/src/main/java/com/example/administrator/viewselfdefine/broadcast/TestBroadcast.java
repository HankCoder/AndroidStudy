package com.example.administrator.viewselfdefine.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2016/12/13 0013.
 */

public class TestBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TestBroadcast.class.getSimpleName(), intent.getAction());
    }
}
