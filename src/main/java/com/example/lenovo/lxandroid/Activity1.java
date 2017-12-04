package com.example.lenovo.lxandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.lxandroid.utils.ActivityCollector;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCollector.addActivity(this);
    }


    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
