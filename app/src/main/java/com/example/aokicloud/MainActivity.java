package com.example.aokicloud;


import android.annotation.SuppressLint;
import android.app.Activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.example.aokicloud.Function.StatusBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StatusBar statusBar = new StatusBar(MainActivity.this);
        //设置颜色为透明
        statusBar.setColor(R.color.transparent);
        statusBar.setTextColor(false); //false 黑字 true 白字

        setContentView(R.layout.activity_main);

        /*
            获取状态栏高度
         */
        int height = 0;
        @SuppressLint("InternalInsetResource") int resourceId = getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            height = getApplicationContext().getResources().getDimensionPixelSize(resourceId);
            System.out.println("===================================" + height);
            View viewById = findViewById(R.id.labeled01);
            viewById.setPadding(height, height, 0, 0);
        }
    }


}