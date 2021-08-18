package com.example.feiwangontouch.simple_touch_event_U_model.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.feiwangontouch.R;
import com.example.feiwangontouch.simple_touch_event_U_model.view.SingleLayout;
import com.example.feiwangontouch.simple_touch_event_U_model.view.SingleView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 堆叠View ontouchactivity
 */
public class StackedViewOnTouchActivity extends AppCompatActivity {
    public static String TAG = "OnTouchActivity";

    @BindView(R.id.baohantwolayout_in_view)
    SingleView baohantwolayoutInView;
    @BindView(R.id.baohantwolayout)
    SingleLayout baohantwolayout;
    @BindView(R.id.baohantwolayout_below_view)
    SingleView baohantwolayoutBelowView;
    @BindView(R.id.baohanlayout)
    SingleLayout baohanlayout;
    @BindView(R.id.below_view)
    SingleView belowView;
    @BindView(R.id.layout_view)
    SingleLayout layoutView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_touch);
        ButterKnife.bind(this);


    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        Log.e(StackedViewOnTouchActivity.TAG, "StackedViewOnTouchActivity: onTouchEvent");
//        boolean b = super.onTouchEvent(event);
//        Log.e(StackedViewOnTouchActivity.TAG, "StackedViewOnTouchActivity: onTouchEvent() return " + b);
//        return b;
//    }
//
//    @Override
//    public boolean dispatchTouchEvent(MotionEvent event) {
//        Log.e(StackedViewOnTouchActivity.TAG, "StackedViewOnTouchActivity: dispatchTouchEvent");
//        boolean b = super.dispatchTouchEvent(event);
//        Log.e(StackedViewOnTouchActivity.TAG, "StackedViewOnTouchActivity: dispatchTouchEvent() return " + b);
//        return b;
//    }

}
