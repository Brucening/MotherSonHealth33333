package com.it.xzr.mothersonhealth.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.base.BaseActivity;
import com.it.xzr.mothersonhealth.fragment.ertong.RecordListFragment;
import com.it.xzr.mothersonhealth.view.CustomActionBar;

public class ErTongActivity extends BaseActivity {
    private CustomActionBar customActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_er_tong);
        initWidget();
        initData();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_er_tong_back);
        customActionBar.setOnBackClickListener(this);
    }

    @Override
    public void initData() {
        super.initData();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fl_activity_er_tong_container, new RecordListFragment());
        transaction.commit();
    }
}
