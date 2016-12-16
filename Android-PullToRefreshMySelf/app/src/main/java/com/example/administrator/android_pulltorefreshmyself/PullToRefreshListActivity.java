package com.example.administrator.android_pulltorefreshmyself;

import android.app.ListActivity;
import android.widget.ArrayAdapter;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/12/1 0001.
 */

public class PullToRefreshListActivity extends ListActivity {

    static final int MENU_MANUAL_REFRESH = 0;
    static final int MENU_DISABLE_SCROLL = 1;
    static final int MENU_SET_MODE = 2;
    static final int MENU_DEMO = 3;

    private LinkedList<String> mListItems;
//    private PullToRefeshListView mPullToRefeshListView;
    private ArrayAdapter<String> mAdapter;
}
