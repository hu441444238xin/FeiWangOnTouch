package com.example.feiwangontouch.simple_touch_event_U_model.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class SingleLayout extends RelativeLayout {
    private final String TAG = "SingleLayout";

    public SingleLayout(Context context) {
        super(context);
    }

    public SingleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "onTouchEvent");
        boolean b = super.onTouchEvent(event);
        Log.e(TAG, "onTouchEvent() return " + b);
        return b;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG, "dispatchTouchEvent");
        boolean b = super.dispatchTouchEvent(event);
        Log.e(TAG, "dispatchTouchEvent() return " + b);
        return b;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.e(TAG, "onInterceptTouchEvent");
        boolean b = super.onInterceptTouchEvent(event);
        Log.e(TAG, "onInterceptTouchEvent() return " + b);
        return b;
    }
}
