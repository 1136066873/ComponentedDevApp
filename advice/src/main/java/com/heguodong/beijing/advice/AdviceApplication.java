package com.heguodong.beijing.advice;

import android.app.Application;
import android.util.Log;

/**
 * Created by 何国栋 on 2020/4/6.
 */

public class AdviceApplication extends Application {

    private static final String TAG = "heguodong_001";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"AdviceApplication is onCreate!!!");
    }
}
