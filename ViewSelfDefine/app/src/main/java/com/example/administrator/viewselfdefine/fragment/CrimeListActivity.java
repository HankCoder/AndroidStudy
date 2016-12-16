package com.example.administrator.viewselfdefine.fragment;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2016/12/12 0012.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
