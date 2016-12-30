package com.example.administrator.viewselfdefine.NerdLauncher;

import android.support.v4.app.Fragment;

import com.example.administrator.viewselfdefine.fragment.SingleFragmentActivity;

/**
 * Created by Administrator on 2016/12/16 0016.
 */

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }
}
