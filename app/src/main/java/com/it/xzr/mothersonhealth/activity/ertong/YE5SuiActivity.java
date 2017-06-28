package com.it.xzr.mothersonhealth.activity.ertong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.base.BaseActivity;
import com.it.xzr.mothersonhealth.view.CustomActionBar;
import com.it.xzr.mothersonhealth.view.CustomYouWuSelect;

public class YE5SuiActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private EditText manSuiNian, manSuiYue, manSuiRi;
    private CustomYouWuSelect woBiHuaHuaYou, woBiHuaHuaWu;
    private CustomYouWuSelect bianBieYanSeYou, bianBieYanSeWu;
    private CustomYouWuSelect xiGuanYouErYuanYou, xiGuanYouErYuanWu;
    private CustomYouWuSelect chuanTuoYiYou, chuanTuoYiWu;
    private CustomYouWuSelect jiangShiQingYou, jiangShiQingWu;
    private CustomYouWuSelect xingBieYou, xingBieWu;
    private CustomYouWuSelect kuaiZiChiFanYou, kuaiZiChiFanWu;
    private CustomYouWuSelect danJiaoTiaoYou, danJiaoTiaoWu;
    private Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye5_sui);
        initWidget();
    }
    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye5_sui_back);
        customActionBar.setOnBackClickListener(this);

        manSuiNian = (EditText) findViewById(R.id.et_activity_ye5_sui_time_nian);
        manSuiYue = (EditText) findViewById(R.id.et_activity_ye5_sui_time_yue);
        manSuiRi = (EditText) findViewById(R.id.et_activity_ye5_sui_time_ri);

        woBiHuaHuaYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_woBiHuaHua_you);
        woBiHuaHuaWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_woBiHuaHua_wu);
        woBiHuaHuaYou.setOther(woBiHuaHuaWu, null);
        woBiHuaHuaWu.setOther(woBiHuaHuaYou, null);

        bianBieYanSeYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_bianBieYanSe_you);
        bianBieYanSeWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_bianBieYanSe_wu);
        bianBieYanSeYou.setOther(bianBieYanSeWu, null);
        bianBieYanSeWu.setOther(bianBieYanSeYou, null);

        xiGuanYouErYuanYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_xiGuanYouErYuan_you);
        xiGuanYouErYuanWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_xiGuanYouErYuan_wu);
        xiGuanYouErYuanYou.setOther(xiGuanYouErYuanWu, null);
        xiGuanYouErYuanWu.setOther(xiGuanYouErYuanYou, null);

        chuanTuoYiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_chuanTuoYi_you);
        chuanTuoYiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_chuanTuoYi_wu);
        chuanTuoYiYou.setOther(chuanTuoYiWu, null);
        chuanTuoYiWu.setOther(chuanTuoYiYou, null);

        jiangShiQingYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_jiangShiQing_you);
        jiangShiQingWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_jiangShiQing_wu);
        jiangShiQingYou.setOther(jiangShiQingWu, null);
        jiangShiQingWu.setOther(jiangShiQingYou, null);

        xingBieYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_zhiDaoXingBie_you);
        xingBieWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_zhiDaoXingBie_wu);
        xingBieYou.setOther(xingBieWu, null);
        xingBieWu.setOther(xingBieYou, null);

        kuaiZiChiFanYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_kuaiZiChiFan_you);
        kuaiZiChiFanWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_kuaiZiChiFan_wu);
        kuaiZiChiFanYou.setOther(kuaiZiChiFanWu, null);
        kuaiZiChiFanWu.setOther(kuaiZiChiFanYou, null);

        danJiaoTiaoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_danJiaoTiao_you);
        danJiaoTiaoWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye5_sui_danJiaoTiao_wu);
        danJiaoTiaoYou.setOther(danJiaoTiaoWu, null);
        danJiaoTiaoWu.setOther(danJiaoTiaoYou, null);

        save = (Button) findViewById(R.id.btn_activity_ye5_sui_save);
        save.setOnClickListener(this);
    }

    @Override
    public String convertToJson() {
        return super.convertToJson();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_activity_ye5_sui_save:

                break;
        }
    }
}
