package com.it.xzr.mothersonhealth.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.base.BaseActivity;


public class MainActivity extends BaseActivity {
    private TextView yunQianTV, yunChanTV, erTongTV, jieZhongTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        initData();
    }

    @Override
    public void initWidget() {
        yunQianTV = (TextView) findViewById(R.id.tv_activity_main_yunQian);
        yunChanTV = (TextView) findViewById(R.id.tv_activity_main_yunChan);
        erTongTV = (TextView) findViewById(R.id.tv_activity_main_erTong);
        jieZhongTV = (TextView) findViewById(R.id.tv_activity_main_jieZhong);
        yunQianTV.setOnClickListener(this);
        yunChanTV.setOnClickListener(this);
        erTongTV.setOnClickListener(this);
        jieZhongTV.setOnClickListener(this);
    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.tv_activity_main_yunQian:
                startActivity(new Intent(this, YunQianActivity.class));
                break;
            case R.id.tv_activity_main_yunChan:
                startActivity(new Intent(this, YunChanActivity.class));
                break;
            case R.id.tv_activity_main_erTong:
                startActivity(new Intent(this, ErTongActivity.class));
                break;
            case R.id.tv_activity_main_jieZhong:
                startActivity(new Intent(this, JieZhongActivity.class));
                break;
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("确定退出吗？");
            builder.setNegativeButton("取消", null);
            builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.show();
        }
        return super.onKeyDown(keyCode, event);
    }
}
