package com.example.administrator.intentservicetest;

import android.content.Context;
import android.content.Intent;
import android.test.ServiceTestCase;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * Created by Administrator on 2016/12/8 0008.
 */

public class CallbackServiceTest extends ServiceTestCase<CallbackService>{

    private Context mContext;

    public CallbackServiceTest() {
        super(CallbackService.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mContext = getContext();
    }

    @SmallTest
    public void testSum() {
        assertNotNull(mContext);
        startService(new Intent(mContext, CallbackService.class));
        CallbackService my = getService();
        assertNull(my);
    }
}
