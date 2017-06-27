package com.it.xzr.mothersonhealth.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.widget.TextView;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.adapter.GongNengMoKuaiRVAdapter;
import com.it.xzr.mothersonhealth.base.BaseActivity;
import com.it.xzr.mothersonhealth.entity.GongNengMoKuaiItem;
import com.it.xzr.mothersonhealth.util.GridViewDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity {
    private TextView yunQianTV, yunChanTV, erTongTV, jieZhongTV;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        initData();
    }

    @Override
    public void initWidget() {
//        yunQianTV = (TextView) findViewById(R.id.tv_activity_main_yunQian);
//        yunChanTV = (TextView) findViewById(R.id.tv_activity_main_yunChan);
//        erTongTV = (TextView) findViewById(R.id.tv_activity_main_erTong);
//        jieZhongTV = (TextView) findViewById(R.id.tv_activity_main_jieZhong);
//        yunQianTV.setOnClickListener(this);
//        yunChanTV.setOnClickListener(this);
//        erTongTV.setOnClickListener(this);
//        jieZhongTV.setOnClickListener(this);

        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
    }

    @Override
    public void initData() {
        RecyclerView.LayoutManager manager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(manager);
        List<GongNengMoKuaiItem> data=new ArrayList<>();
        data.add(new GongNengMoKuaiItem("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3795770905,4042765228&fm=26&gp=0.jpg","孕前篇"));
        data.add(new GongNengMoKuaiItem("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=847148555,2831273504&fm=26&gp=0.jpg","孕产篇"));
        data.add(new GongNengMoKuaiItem("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=108724125,966706653&fm=26&gp=0.jpg","儿童篇"));
        data.add(new GongNengMoKuaiItem("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=928861582,28679776&fm=26&gp=0.jpg","接种篇"));
        GongNengMoKuaiRVAdapter adapter=new GongNengMoKuaiRVAdapter(this,data);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new GridViewDividerItemDecoration(this,R.drawable.activity_main_rv_divider_bg));
    }

//    @Override
//    public void onClick(View v) {
//        super.onClick(v);
//        switch (v.getId()) {
//            case R.id.tv_activity_main_yunQian:
//                startActivity(new Intent(this, YunQianActivity.class));
//                break;
//            case R.id.tv_activity_main_yunChan:
//                startActivity(new Intent(this, YunChanActivity.class));
//                break;
//            case R.id.tv_activity_main_erTong:
//                startActivity(new Intent(this, ErTongActivity.class));
//                break;
//            case R.id.tv_activity_main_jieZhong:
//                startActivity(new Intent(this, JieZhongActivity.class));
//                break;
//        }
//
//    }

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
