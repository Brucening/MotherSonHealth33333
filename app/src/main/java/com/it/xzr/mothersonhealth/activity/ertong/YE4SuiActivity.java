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

public class YE4SuiActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private EditText manSuiNian, manSuiYue, manSuiRi;
    private CustomYouWuSelect ruYouErYuanWeiRu, ruYouErYuanYiRu;
    private CustomYouWuSelect jianDaoYou, jianDaoWu;
    private CustomYouWuSelect duLiCeSuoYou, duLiCeSuoWu;
    private CustomYouWuSelect xiaoGuShiYou, xiaoGuShiWu;
    private EditText dianZiShiPin;
    private EditText huWaiHuoDong;
    private CustomYouWuSelect juZiYou, juZiWu;
    private CustomYouWuSelect dengDaiYou, dengDaiWu;
    private CustomYouWuSelect duLiChuanYiYou, duLiChuanYiWu;
    private CustomYouWuSelect danJiaoZhanLiYou, danJiaoZhanLiWu;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye4_sui);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye4_sui_back);
        customActionBar.setOnBackClickListener(this);

        manSuiNian = (EditText) findViewById(R.id.et_activity_ye4_sui_time_nian);
        manSuiYue = (EditText) findViewById(R.id.et_activity_ye4_sui_time_yue);
        manSuiRi = (EditText) findViewById(R.id.et_activity_ye4_sui_time_ri);

        ruYouErYuanWeiRu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_ruYouErYuan_you);
        ruYouErYuanYiRu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_ruYouErYuan_wu);
        ruYouErYuanWeiRu.setOther(ruYouErYuanYiRu, null);
        ruYouErYuanYiRu.setOther(ruYouErYuanWeiRu, null);

        jianDaoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_jianDaoJianThing_you);
        jianDaoWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_jianDaoJianThing_wu);
        jianDaoYou.setOther(jianDaoWu, null);
        jianDaoWu.setOther(jianDaoYou, null);

        duLiCeSuoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_duLiCeSuo_you);
        duLiCeSuoWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_duLiCeSuo_wu);
        duLiCeSuoYou.setOther(duLiCeSuoWu, null);
        duLiCeSuoWu.setOther(duLiCeSuoYou, null);

        xiaoGuShiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_xiaoGuShi_you);
        xiaoGuShiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_xiaoGuShi_wu);
        xiaoGuShiYou.setOther(xiaoGuShiWu, null);
        xiaoGuShiWu.setOther(xiaoGuShiYou, null);

        dianZiShiPin = (EditText) findViewById(R.id.et_activity_ye4_sui_kanDianZiShiPin);

        huWaiHuoDong = (EditText) findViewById(R.id.et_activity_ye4_sui_huWaiHuoDong);

        juZiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_xingRongCiJuZi_you);
        juZiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_xingRongCiJuZi_wu);
        juZiYou.setOther(juZiWu, null);
        juZiWu.setOther(juZiYou, null);

        dengDaiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_dengDai_you);
        dengDaiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_dengDai_wu);
        dengDaiYou.setOther(dengDaiWu, null);
        dengDaiWu.setOther(dengDaiYou, null);

        duLiChuanYiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_chuanYi_you);
        duLiChuanYiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_chuanYi_wu);
        duLiChuanYiYou.setOther(duLiChuanYiWu, null);
        duLiChuanYiWu.setOther(duLiChuanYiYou, null);

        danJiaoZhanLiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_danJiaoZhan_you);
        danJiaoZhanLiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye4_sui_danJiaoZhan_wu);
        danJiaoZhanLiYou.setOther(danJiaoZhanLiWu, null);
        danJiaoZhanLiWu.setOther(danJiaoZhanLiYou, null);

        save = (Button) findViewById(R.id.btn_activity_ye4_sui_save);
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
            case R.id.btn_activity_ye4_sui_save:

                break;
        }
    }
}
