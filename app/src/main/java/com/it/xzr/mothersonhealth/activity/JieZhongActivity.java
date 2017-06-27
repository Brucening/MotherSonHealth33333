package com.it.xzr.mothersonhealth.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.base.BaseActivity;
import com.it.xzr.mothersonhealth.view.CustomActionBar;

public class JieZhongActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jie_zhong);
        initWidget();
    }


    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar= (CustomActionBar) findViewById(R.id.cab_activity_jie_zhong_back);
        customActionBar.setOnBackClickListener(this);
    }
}
