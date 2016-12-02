package com.example.administrator.pulltorefreshtestmyself;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private RefreshableView mRefreshableView;
    private ListView mListView;
    private ArrayAdapter<String> mAdapter;
    private String[] mItem = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        mRefreshableView = (RefreshableView) findViewById(R.id.refreshable_view);
        mListView = (ListView) findViewById(R.id.list_view);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mItem);
        mListView.setAdapter(mAdapter);
        mRefreshableView.setOnRefreshListener(new RefreshableView.PullToRefreshListener() {
            @Override
            public void onRefresh() {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mRefreshableView.finishRefreshing();
            }
        }, 0);
    }
}
