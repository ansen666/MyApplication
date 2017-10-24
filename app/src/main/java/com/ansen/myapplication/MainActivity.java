package com.ansen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a=10;
        a+=20;

        Log.v("ansen","verbose");
        Log.d("ansen","debug");
        Log.i("ansen","info");
        Log.w("ansen","warn");
        Log.e("ansen","error");

        System.out.println("a的值:"+a);
    }
}
