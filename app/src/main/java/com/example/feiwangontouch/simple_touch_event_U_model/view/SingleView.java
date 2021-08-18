package com.example.feiwangontouch.simple_touch_event_U_model.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.feiwangontouch.R;

public class SingleView extends View {
    private final String TAG = "SingleView";

    public SingleView(Context context) {
        super(context);
        initView(context);
    }

    public SingleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        initView(context);
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

    private void initView(Context context) {
        setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimaryDark));
    }
}
