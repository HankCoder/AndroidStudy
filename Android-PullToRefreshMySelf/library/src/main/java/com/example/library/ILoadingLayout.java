package com.example.library;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/**
 * Created by Administrator on 2016/12/1 0001.
 */

public interface ILoadingLayout {

    public void setLashUpdatedLabel(CharSequence label);

    public void setLoadingDrawable(Drawable drawable);

    public void setPullLabel(CharSequence pullLabel);

    public void setRefreshingLabel(CharSequence refreshingLabel);

    public void setReleaseLabel(CharSequence releaseLabel);

    public void setTextTypeface(Typeface tf);
}
