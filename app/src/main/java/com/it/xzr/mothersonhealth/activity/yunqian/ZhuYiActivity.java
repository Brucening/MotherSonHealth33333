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

public class ZhuYiActivity extends BaseActivity {
    private LinearLayout linearlayout_shengyu,linearlayout_pougong,
            linearlayout_biyun,linearlayout_huaiyun,linearlayout_shouyun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuyi);
        initWidget();
        initData();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        linearlayout_shengyu = (LinearLayout) findViewById(R.id.linear_shengyu);
        linearlayout_pougong = (LinearLayout) findViewById(R.id.linear_pougong);
        linearlayout_biyun = (LinearLayout) findViewById(R.id.linear_biyun);
        linearlayout_huaiyun = (LinearLayout) findViewById(R.id.linear_huaiyun);
        linearlayout_shouyun = (LinearLayout) findViewById(R.id.linear_shouyun);
        linearlayout_shengyu.setOnClickListener(this);
        linearlayout_pougong.setOnClickListener(this);
        linearlayout_biyun.setOnClickListener(this);
        linearlayout_huaiyun.setOnClickListener(this);
        linearlayout_shouyun.setOnClickListener(this);
    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.linear_shengyu:
                Intent intent=new Intent(ZhuYiActivity.this,ShengYuActivity.class);
                startActivity(intent);
                break;
            case R.id.linear_pougong:
                Intent intent2=new Intent(ZhuYiActivity.this,PougongActivity.class);
                startActivity(intent2);
                break;
            case R.id.linear_biyun:
                Intent intent3=new Intent(ZhuYiActivity.this,BiYunActivity.class);
                startActivity(intent3);
                break;
            case R.id.linear_huaiyun:
                Intent intent4=new Intent(ZhuYiActivity.this,HuaiYunActivity.class);
                startActivity(intent4);
                break;
            case R.id.linear_shouyun:
                Intent intent5=new Intent(ZhuYiActivity.this,ShouYunActivity.class);
                startActivity(intent5);
                break;
        }
    }
}
