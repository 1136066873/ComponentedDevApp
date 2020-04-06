package com.heguodong.beijing.componenteddevapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by 何国栋 on 2020/4/6.
 */

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "heguodong_001";
    private LocalBroadcastManager localBroadcastManager = null;
    private static final String ACTION = "LocalBroadcastManager_Action";
    private BroadcastReceiver LocalBroadcastReceiver = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e(TAG,"protected onCreate method is called ");

        //init view and click event
        findViewById(R.id.tv_info2).setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        //init LocalBroadCastManger
        localBroadcastManager = LocalBroadcastManager.getInstance(this);

        //init Receiver
        LocalBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Log.e(TAG,"收到本地广播发出来的广播数据");
            }
        };

        //register Receiver
        localBroadcastManager.registerReceiver(LocalBroadcastReceiver,new IntentFilter(ACTION));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //unregister Receiver
        localBroadcastManager.unregisterReceiver(LocalBroadcastReceiver);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_info2:
                localBroadcastManager.sendBroadcast(new Intent(ACTION));
                break;
        }
    }
}
