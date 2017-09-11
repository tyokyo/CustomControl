package com.taoyong.customcontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.taoyong.widget.combination.DelInputView;
import com.taoyong.widget.combination.TitleBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试DelInputView
        DelInputView delInputView = (DelInputView) findViewById(R.id.delInputView);
        delInputView.getEditText().setText("123456");
        //测试TitleBar
        TitleBar titleBar = (TitleBar) findViewById(R.id.titleBar);
        titleBar.setTitleBarCenterText("标题");
        titleBar.setTitleBarLeftImage(R.drawable.custom_control_plus);
        titleBar.setTitleBarRightImage(R.drawable.custom_control_back);
        titleBar.setTitleBarBackground(android.R.color.holo_blue_light);
        titleBar.setOnClickTitleBarListener(new TitleBar.onClickTitleBarListener() {
            @Override
            public void onClickLeft(View v) {
                toask_make("This is the picture on the left.");
            }

            @Override
            public void onClickRight(View v) {
                toask_make("Here is the picture on the right.");
            }

            @Override
            public void onClickTitle(View v) {
                toask_make("This is the title section.");
            }
        });
    }

    private void toask_make(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}