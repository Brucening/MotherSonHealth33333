package com.it.xzr.mothersonhealth.activity.ertong;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.adapter.YEXinShengErWeiYangFangShiAdapter;
import com.it.xzr.mothersonhealth.base.BaseActivity;
import com.it.xzr.mothersonhealth.view.CustomActionBar;
import com.it.xzr.mothersonhealth.view.CustomYouWuSelect;

import java.util.ArrayList;
import java.util.List;

public class YEXinShengErActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private Spinner weiYangFangShi1, weiYangFangShi2, weiYangFangShi3, weiYangFangShi4, weiYangFangShi5, weiYangFangShi6, weiYangFangShi7;
    private String weiYangFangShiStr1, weiYangFangShiStr2, weiYangFangShiStr3, weiYangFangShiStr4, weiYangFangShiStr5, weiYangFangShiStr6, weiYangFangShiStr7;
    private EditText chiNai1, chiNai2, chiNai3, chiNai4, chiNai5, chiNai6, chiNai7;
    private EditText xiaoBian1, xiaoBian2, xiaoBian3, xiaoBian4, xiaoBian5, xiaoBian6, xiaoBian7;
    private EditText daBian1, daBian2, daBian3, daBian4, daBian5, daBian6, daBian7;
    private EditText tiZhong1, tiZhong2, tiZhong3, tiZhong4, tiZhong5, tiZhong6, tiZhong7;
    private String huangRanState1, huangRanState2, huangRanState3, huangRanState4, huangRanState5, huangRanState6, huangRanState7;
    private CustomYouWuSelect huangRanYou1, huangRanYou2, huangRanYou3, huangRanYou4, huangRanYou5, huangRanYou6, huangRanYou7;
    private CustomYouWuSelect huangRanWu1, huangRanWu2, huangRanWu3, huangRanWu4, huangRanWu5, huangRanWu6, huangRanWu7;
    private EditText yiGanTimeNian, yiGanTimeYue, yiGanTimeRi;
    private EditText kaJieTimeNian, kaJieTimeYue, kaJieTimeRi;
    private CustomYouWuSelect jiBingShaiChaYou, jiBingShaiChaWu;
    private CustomYouWuSelect tingLiShaiChaYou, tingLiShaiChaWu;
    private Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yexin_sheng_er);
        initWidget();
        initData();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_yexin_sheng_er_back);
        customActionBar.setOnBackClickListener(this);

        weiYangFangShi1 = (Spinner) findViewById(R.id.spinner_activity_yexin_sheng_er_1_weiYangFangShi);
        weiYangFangShi1.setOnItemSelectedListener(this);
        weiYangFangShi2 = (Spinner) findViewById(R.id.spinner_activity_yexin_sheng_er_2_weiYangFangShi);
        weiYangFangShi2.setOnItemSelectedListener(this);
        weiYangFangShi3 = (Spinner) findViewById(R.id.spinner_activity_yexin_sheng_er_3_weiYangFangShi);
        weiYangFangShi3.setOnItemSelectedListener(this);
        weiYangFangShi4 = (Spinner) findViewById(R.id.spinner_activity_yexin_sheng_er_4_weiYangFangShi);
        weiYangFangShi4.setOnItemSelectedListener(this);
        weiYangFangShi5 = (Spinner) findViewById(R.id.spinner_activity_yexin_sheng_er_5_weiYangFangShi);
        weiYangFangShi5.setOnItemSelectedListener(this);
        weiYangFangShi6 = (Spinner) findViewById(R.id.spinner_activity_yexin_sheng_er_6_weiYangFangShi);
        weiYangFangShi6.setOnItemSelectedListener(this);
        weiYangFangShi7 = (Spinner) findViewById(R.id.spinner_activity_yexin_sheng_er_7_weiYangFangShi);
        weiYangFangShi7.setOnItemSelectedListener(this);

        chiNai1 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_1_chiNaiCiShu);
        chiNai2 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_2_chiNaiCiShu);
        chiNai3 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_3_chiNaiCiShu);
        chiNai4 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_4_chiNaiCiShu);
        chiNai5 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_5_chiNaiCiShu);
        chiNai6 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_6_chiNaiCiShu);
        chiNai7 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_7_chiNaiCiShu);

        xiaoBian1 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_1_xiaoBianCiShu);
        xiaoBian2 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_2_xiaoBianCiShu);
        xiaoBian3 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_3_xiaoBianCiShu);
        xiaoBian4 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_4_xiaoBianCiShu);
        xiaoBian5 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_5_xiaoBianCiShu);
        xiaoBian6 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_6_xiaoBianCiShu);
        xiaoBian7 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_7_xiaoBianCiShu);

        daBian1 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_1_daBianCiShu);
        daBian2 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_2_daBianCiShu);
        daBian3 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_3_daBianCiShu);
        daBian4 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_4_daBianCiShu);
        daBian5 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_5_daBianCiShu);
        daBian6 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_6_daBianCiShu);
        daBian7 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_7_daBianCiShu);

        tiZhong1 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_1_tiZhong);
        tiZhong2 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_2_tiZhong);
        tiZhong3 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_3_tiZhong);
        tiZhong4 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_4_tiZhong);
        tiZhong5 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_5_tiZhong);
        tiZhong6 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_6_tiZhong);
        tiZhong7 = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_7_tiZhong);

        huangRanYou1 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_1_huangRan_you);
        huangRanYou2 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_2_huangRan_you);
        huangRanYou3 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_3_huangRan_you);
        huangRanYou4 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_4_huangRan_you);
        huangRanYou5 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_5_huangRan_you);
        huangRanYou6 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_6_huangRan_you);
        huangRanYou7 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_7_huangRan_you);
        huangRanWu1 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_1_huangRan_wu);
        huangRanWu2 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_2_huangRan_wu);
        huangRanWu3 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_3_huangRan_wu);
        huangRanWu4 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_4_huangRan_wu);
        huangRanWu5 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_5_huangRan_wu);
        huangRanWu6 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_6_huangRan_wu);
        huangRanWu7 = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_7_huangRan_wu);

        yiGanTimeNian = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_firstYiGan_nian);
        yiGanTimeYue = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_firstYiGan_yue);
        yiGanTimeRi = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_firstYiGan_ri);

        kaJieTimeNian = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_firstKaJie_nian);
        kaJieTimeYue = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_firstKaJie_yue);
        kaJieTimeRi = (EditText) findViewById(R.id.et_activity_yexin_sheng_er_firstKaJie_ri);

        jiBingShaiChaYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_jiBingShaiCha_you);
        jiBingShaiChaWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_jiBingShaiCha_wu);

        tingLiShaiChaYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_tingLiShaiCha_you);
        tingLiShaiChaWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_yexin_sheng_er_tingLiShaiCha_wu);

        save = (Button) findViewById(R.id.btn_activity_yexin_sheng_er_save);
    }

    @Override
    public void initData() {
        //初始化喂养方式的Spinner控件
        List<String> strWeiYangFangShi = new ArrayList<>();
        strWeiYangFangShi.add("母乳喂养");
        strWeiYangFangShi.add("奶粉喂养");
        strWeiYangFangShi.add("混合喂养");
        YEXinShengErWeiYangFangShiAdapter adapter1 = new YEXinShengErWeiYangFangShiAdapter(strWeiYangFangShi, this);
        weiYangFangShi1.setAdapter(adapter1);
        YEXinShengErWeiYangFangShiAdapter adapter2 = new YEXinShengErWeiYangFangShiAdapter(strWeiYangFangShi, this);
        weiYangFangShi2.setAdapter(adapter2);
        YEXinShengErWeiYangFangShiAdapter adapter3 = new YEXinShengErWeiYangFangShiAdapter(strWeiYangFangShi, this);
        weiYangFangShi3.setAdapter(adapter3);
        YEXinShengErWeiYangFangShiAdapter adapter4 = new YEXinShengErWeiYangFangShiAdapter(strWeiYangFangShi, this);
        weiYangFangShi4.setAdapter(adapter4);
        YEXinShengErWeiYangFangShiAdapter adapter5 = new YEXinShengErWeiYangFangShiAdapter(strWeiYangFangShi, this);
        weiYangFangShi5.setAdapter(adapter5);
        YEXinShengErWeiYangFangShiAdapter adapter6 = new YEXinShengErWeiYangFangShiAdapter(strWeiYangFangShi, this);
        weiYangFangShi6.setAdapter(adapter6);
        YEXinShengErWeiYangFangShiAdapter adapter7 = new YEXinShengErWeiYangFangShiAdapter(strWeiYangFangShi, this);
        weiYangFangShi7.setAdapter(adapter7);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_activity_yexin_sheng_er_save:
                if (!TextUtils.isEmpty(chiNai1.getText()) && !TextUtils.isEmpty(chiNai2.getText()) && !TextUtils.isEmpty(chiNai3.getText()) && !TextUtils.isEmpty(chiNai4.getText()) && !TextUtils.isEmpty(chiNai5.getText()) && !TextUtils.isEmpty(chiNai6.getText()) && !TextUtils.isEmpty(chiNai7.getText())
                        && !TextUtils.isEmpty(xiaoBian1.getText()) && !TextUtils.isEmpty(xiaoBian2.getText()) && !TextUtils.isEmpty(xiaoBian3.getText()) && !TextUtils.isEmpty(xiaoBian4.getText()) && !TextUtils.isEmpty(xiaoBian5.getText()) && !TextUtils.isEmpty(xiaoBian6.getText()) && !TextUtils.isEmpty(xiaoBian7.getText())
                        && !TextUtils.isEmpty(daBian1.getText()) && !TextUtils.isEmpty(daBian2.getText()) && !TextUtils.isEmpty(daBian3.getText()) && !TextUtils.isEmpty(daBian4.getText()) && !TextUtils.isEmpty(daBian5.getText()) && !TextUtils.isEmpty(daBian6.getText()) && !TextUtils.isEmpty(daBian7.getText())
                        && !TextUtils.isEmpty(tiZhong1.getText()) && !TextUtils.isEmpty(tiZhong2.getText()) && !TextUtils.isEmpty(tiZhong3.getText()) && !TextUtils.isEmpty(tiZhong4.getText()) && !TextUtils.isEmpty(tiZhong5.getText()) && !TextUtils.isEmpty(tiZhong6.getText()) && !TextUtils.isEmpty(tiZhong7.getText())
                        && !TextUtils.isEmpty(huangRanState1) && !TextUtils.isEmpty(huangRanState2) && !TextUtils.isEmpty(huangRanState3) && !TextUtils.isEmpty(huangRanState4) && !TextUtils.isEmpty(huangRanState5) && !TextUtils.isEmpty(huangRanState6) && !TextUtils.isEmpty(huangRanState7)

                        )
                    break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        super.onItemSelected(parent, view, position, id);
        switch (parent.getId()) {
            case R.id.spinner_activity_yexin_sheng_er_1_weiYangFangShi:
                weiYangFangShiStr1 = (String) parent.getAdapter().getItem(position);
                break;
            case R.id.spinner_activity_yexin_sheng_er_2_weiYangFangShi:
                weiYangFangShiStr2 = (String) parent.getAdapter().getItem(position);
                break;
            case R.id.spinner_activity_yexin_sheng_er_3_weiYangFangShi:
                weiYangFangShiStr3 = (String) parent.getAdapter().getItem(position);
                break;
            case R.id.spinner_activity_yexin_sheng_er_4_weiYangFangShi:
                weiYangFangShiStr4 = (String) parent.getAdapter().getItem(position);
                break;
            case R.id.spinner_activity_yexin_sheng_er_5_weiYangFangShi:
                weiYangFangShiStr5 = (String) parent.getAdapter().getItem(position);
                break;
            case R.id.spinner_activity_yexin_sheng_er_6_weiYangFangShi:
                weiYangFangShiStr6 = (String) parent.getAdapter().getItem(position);
                break;
            case R.id.spinner_activity_yexin_sheng_er_7_weiYangFangShi:
                weiYangFangShiStr7 = (String) parent.getAdapter().getItem(position);
                break;
        }
    }
}
