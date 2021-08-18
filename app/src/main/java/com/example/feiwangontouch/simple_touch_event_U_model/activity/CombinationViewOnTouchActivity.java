package com.example.feiwangontouch.simple_touch_event_U_model.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.feiwangontouch.R;

public class CombinationViewOnTouchActivity extends AppCompatActivity {
    public static String TAG = "CombinationViewOnTouchActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combination_view_on_touch);
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        Log.e(TAG, "CombinationViewOnTouchActivity: onTouchEvent");
//        boolean b = super.onTouchEvent(event);
//        Log.e(TAG, "CombinationViewOnTouchActivity: onTouchEvent() return " + b);
//        return b;
//    }
//
//    @Override
//    public boolean dispatchTouchEvent(MotionEvent event) {
//        Log.e(TAG, "CombinationViewOnTouchActivity: dispatchTouchEvent");
//        boolean b = super.dispatchTouchEvent(event);
//        Log.e(TAG, "CombinationViewOnTouchActivity: dispatchTouchEvent() return " + b);
//        return b;
//    }
}
