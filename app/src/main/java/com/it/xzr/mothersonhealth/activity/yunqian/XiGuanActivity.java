package com.it.xzr.mothersonhealth.activity.yunqian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.base.BaseActivity;


/**
 * Created by GN on 2017/5/24.
 */

public class XiGuanActivity extends BaseActivity {
    private FrameLayout frameLayout_jiancha,frameLayout_yesuan,frameLayout_fangshi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiguan);
        initWidget();
        initData();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        frameLayout_jiancha = (FrameLayout) findViewById(R.id.framelayout_jiancha);
        frameLayout_yesuan = (FrameLayout) findViewById(R.id.framelayout_yesuan);
        frameLayout_fangshi = (FrameLayout) findViewById(R.id.framelayout_fangshi);
        frameLayout_jiancha.setOnClickListener(this);
        frameLayout_yesuan.setOnClickListener(this);
        frameLayout_fangshi.setOnClickListener(this);
    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.framelayout_jiancha:
                Intent intent=new Intent(XiGuanActivity.this,JianChaActivity.class);
                startActivity(intent);
                break;
            case R.id.framelayout_yesuan:
                Intent intent2=new Intent(XiGuanActivity.this,YeSuanActivity.class);
                startActivity(intent2);
                break;
            case R.id.framelayout_fangshi:
                Intent intent3=new Intent(XiGuanActivity.this,FangShiActivity.class);
                startActivity(intent3);
                break;
        }


    }
}
