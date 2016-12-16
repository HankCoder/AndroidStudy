package com.example.administrator.viewselfdefine.assest.beatbox;

import android.support.v4.app.Fragment;

import com.example.administrator.viewselfdefine.fragment.SingleFragmentActivity;

/**
 * Created by Administrator on 2016/12/16 0016.
 */

public class BeatBoxActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}

