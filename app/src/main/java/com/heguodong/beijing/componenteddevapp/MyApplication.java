package com.heguodong.beijing.componenteddevapp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by 何国栋 on 2020/4/4.
 */

public class MyApplication extends Application {

    private static final String TAG = "heguodong_001";

    private ActivityLifecycleCallbacks activityLifecycleCallbacks = null;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"MyApplication is create");

        activityLifecycleCallbacks = new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Log.e(TAG,"MyApplication - onActivityCreated -> " + activity.getComponentName());
            }

            @Override
            public void onActivityStarted(Activity activity) {
                Log.e(TAG,"MyApplication - onActivityStarted -> " + activity.getComponentName());
            }

            @Override
            public void onActivityResumed(Activity activity) {
                Log.e(TAG,"MyApplication - onActivityResumed -> " + activity.getComponentName());
            }

            @Override
            public void onActivityPaused(Activity activity) {
                Log.e(TAG,"MyApplication - onActivityPaused -> " + activity.getComponentName());
            }

            @Override
            public void onActivityStopped(Activity activity) {
                Log.e(TAG,"MyApplication - onActivityStopped -> " + activity.getComponentName());
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Log.e(TAG,"MyApplication - onActivitySaveInstanceState -> " + activity.getComponentName());
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                Log.e(TAG,"MyApplication - onActivityDestroyed -> " + activity.getComponentName());
            }
        };
        registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
