package com.heguodong.beijing.componenteddevapp;

import android.app.Application;
import android.util.Log;

/**
 * Created by 何国栋 on 2020/4/4.
 */

public class MyApplication extends Application {

    private static final String TAG = "heguodong";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"MyApplication is create");
    }
}
