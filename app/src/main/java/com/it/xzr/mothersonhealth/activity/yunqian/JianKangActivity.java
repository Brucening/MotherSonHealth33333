package com.it.xzr.mothersonhealth.activity.yunqian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.base.BaseActivity;


/**
 * Created by GN on 2017/5/24.
 */

public class JianKangActivity extends BaseActivity {
    private LinearLayout linearlayout_kouqiang,linearlayout_tizhong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiankang);
        initWidget();
        initData();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        linearlayout_kouqiang = (LinearLayout) findViewById(R.id.linear_kouqiang);
        linearlayout_tizhong  = (LinearLayout) findViewById(R.id.linear_tizhong);
        linearlayout_kouqiang.setOnClickListener(this);
        linearlayout_tizhong.setOnClickListener(this);
    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.linear_kouqiang:
                Intent intent=new Intent(JianKangActivity.this,KouQiangActivity.class);
                startActivity(intent);
                break;
            case R.id.linear_tizhong:
                Intent intent2=new Intent(JianKangActivity.this,TiZhongActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
