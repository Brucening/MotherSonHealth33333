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

public class YaoWuActivity extends BaseActivity {
    private LinearLayout linearlayout_kongzhi,linearlayout_jinfang,linearlayout_heli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yaowu);
        initWidget();
        initData();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        linearlayout_kongzhi = (LinearLayout) findViewById(R.id.linear_kongzhi);
        linearlayout_jinfang = (LinearLayout) findViewById(R.id.linear_jinfang);
        linearlayout_heli = (LinearLayout) findViewById(R.id.linear_heli);
        linearlayout_kongzhi.setOnClickListener(this);
        linearlayout_jinfang.setOnClickListener(this);
        linearlayout_heli.setOnClickListener(this);
    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.linear_kongzhi:
                Intent intent=new Intent(YaoWuActivity.this,KongZhiActivity.class);
                startActivity(intent);
                break;
            case R.id.linear_jinfang:
                Intent intent2=new Intent(YaoWuActivity.this,JinFangActivity.class);
                startActivity(intent2);
                break;
            case R.id.linear_heli:
                Intent intent3=new Intent(YaoWuActivity.this,HeLiActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
