package com.heguodong.beijing.componenteddevapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.heguodong.beijing.advice.Advice;
import com.heguodong.beijing.news.News;
import com.heguodong.beijing.settings.Settings;
import com.heguodong.beijing.submit.Submit;
import com.heguodong.beijing.web.Web;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_info).setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_info:
                //just test
                justTest(this);
                break;
        }
    }

    private void justTest(Context context) {
        //测试
        Advice.test();
        News.test();
        Settings.test();
        Submit.test();
        Web.test();
    }
}
