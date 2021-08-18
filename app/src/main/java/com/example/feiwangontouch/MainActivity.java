package com.example.feiwangontouch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.feiwangontouch.simple_touch_event_U_model.activity.CombinationViewOnTouchActivity;
import com.example.feiwangontouch.simple_touch_event_U_model.activity.StackedViewOnTouchActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.goto_stackedView_OnTouch_Activity)
    Button gotoStackedViewOnTouchActivity;
    @BindView(R.id.goto_combinationView_OnTouch_Activity)
    Button gotoCombinationViewOnTouchActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        gotoStackedViewOnTouchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StackedViewOnTouchActivity.class);
                startActivity(intent);
            }
        });
        gotoCombinationViewOnTouchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CombinationViewOnTouchActivity.class);
                startActivity(intent);
            }
        });
    }
}
