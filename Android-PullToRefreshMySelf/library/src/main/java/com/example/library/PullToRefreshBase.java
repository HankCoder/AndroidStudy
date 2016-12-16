package com.example.library;

import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/12/1 0001.
 */

public abstract class PullToRefreshBase<T extends View> extends LinearLayout implements IPullToRefresh{

    // ===============================================================
    // Constants
    // ===============================================================

    static final boolean DEBUG = true;

    static final boolean USE_HW_LAYERS = false;

    static final String LOG_TAG = "PullToRefresh";

    static final float FRICTION = 2.0f;

    public static final int SMOOTH_SCROLL_DURATION_MS = 200;
    public static final int SMOOTH_SCROLL_LONG_DURATION_MS = 325;
    static final int DEMO_SCROLL_INTERVAL = 225;

    static final String STATE_STATE = "ptr_state";
    static final String STATE_MODE = "ptr_mode";
    static final String STATE_CURRENT_MODE = "ptr_current_mode";
    static final String STATE_SCROLLING_REFRESHING_ENABLED = "ptr_disable_scrolling";
    static final String STATE_SHOW_REFRESHING_VIEW = "ptr_show_refreshing_view";
    static final String STATE_SUPER = "ptr_super";

    // ===============================================================
    // Fields
    // ===============================================================

    private int mTouchSlop;
    private float mLastMotionx, mLastMotionY;
    private float mInitialMotionx, mInitialMotionY;

    private boolean mIsBeingDragged = false;
    private State mState = State.RESET;

}
