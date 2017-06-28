package com.it.xzr.mothersonhealth.activity;

import android.content.DialogInterface;
import android.content.Intent;
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

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    @Override
    public void initData() {
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(manager);
        List<GongNengMoKuaiItem> data = new ArrayList<>();
        data.add(new GongNengMoKuaiItem("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3795770905,4042765228&fm=26&gp=0.jpg", "孕前篇"));
        data.add(new GongNengMoKuaiItem("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=847148555,2831273504&fm=26&gp=0.jpg", "孕产篇"));
        data.add(new GongNengMoKuaiItem("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=108724125,966706653&fm=26&gp=0.jpg", "儿童篇"));
        data.add(new GongNengMoKuaiItem("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=928861582,28679776&fm=26&gp=0.jpg", "接种篇"));
        GongNengMoKuaiRVAdapter adapter = new GongNengMoKuaiRVAdapter(this, data);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new GridViewDividerItemDecoration(this));
        adapter.setOnClickListner(new GongNengMoKuaiRVAdapter.OnClickListner() {
            @Override
            public void onItemClickListner(String name) {
                switch (name) {
                    case "孕前篇":
                        startActivity(new Intent(MainActivity.this, YunQianActivity.class));
                        break;
                    case "孕产篇":
                        startActivity(new Intent(MainActivity.this, YunChanActivity.class));
                        break;
                    case "儿童篇":
                        startActivity(new Intent(MainActivity.this, ErTongActivity.class));
                        break;
                    case "接种篇":
                        startActivity(new Intent(MainActivity.this, JieZhongActivity.class));
                        break;
                }
            }
        });
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
