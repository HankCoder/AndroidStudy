package com.example.library;

import android.view.View;
import android.view.animation.Interpolator;

/**
 * Created by Administrator on 2016/12/1 0001.
 */

public interface IPullToRefresh<T extends View> {

    public boolean demo();

    public Mode getCurrentMode();

    public boolean getFilterTouchEvents();

    public ILoadingLayout getLoadingLayoutProxy();

    public ILoadingLayout getLoadingLayoutProxy(boolean includeStart, boolean includeEnd);

    public Mode getMode();

    public T getRefreshableView();

    public boolean getShowViewWhileRefreshing();

    public State getState();

    public boolean isPullToRefreshEnabled();

    public boolean isPullToRefreshOverScrollEnabled();

    public boolean isRefreshing();

    public boolean isScrollingWhileRefreshingEnabled();

    public void onRefreshComplete();

    public void setFilterTouchEvents(boolean filterEvents);

    public void setMode(Mode mode);

    public void setOnPullEventListener(OnPullEventListener<T> listener);

    public void setOnRefreshListener(OnRefreshListener<T> listener);

    public void setOnRefreshListener(OnRefreshListener2<T> listener);

    public void setPullToRefreshOverScrollEnabled(boolean enabled);

    public void setRefreshing();

    public void setRefreshing(boolean doScroll);

    public void setScrollAnimationInterpolator(Interpolator interpolator);

    public void setScrollingWhileRefreshingEnabled(boolean scrollingWhileRefreshingEnabled);

    public void setShowViewWhileRefreshing(boolean showView);
}
