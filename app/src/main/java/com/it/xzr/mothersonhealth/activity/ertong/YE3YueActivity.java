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

public class YE3YueActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private CustomYouWuSelect muRuWeiYang, hunHeWeiYang, renGongWeiYang;
    private CustomYouWuSelect chiNaiYou, chiNaiWu;
    private CustomYouWuSelect weiShengSuYou, weiShengSuWu;
    private CustomYouWuSelect shuoHuaYou, shuoHuaWu;
    private EditText huoDongShiJian;
    private CustomYouWuSelect daShengFanYingYou, daShengFanYingWu;
    private CustomYouWuSelect weiXiaoYou, weiXiaoWu;
    private CustomYouWuSelect zhuShiYou, zhuShiWu;
    private CustomYouWuSelect taiTouYou, taiTouWu;
    private Button save;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye3_yue);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye3_yue_back);
        customActionBar.setOnBackClickListener(this);

        muRuWeiYang = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_weiYangFangShi_muRu);
        hunHeWeiYang = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_weiYangFangShi_hunHe);
        renGongWeiYang = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_weiYangFangShi_renGong);
        muRuWeiYang.setOther(hunHeWeiYang, renGongWeiYang);
        hunHeWeiYang.setOther(muRuWeiYang, renGongWeiYang);
        renGongWeiYang.setOther(muRuWeiYang, hunHeWeiYang);

        chiNaiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_chiNai_you);
        chiNaiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_chiNai_wu);
        chiNaiYou.setOther(chiNaiWu, null);
        chiNaiWu.setOther(chiNaiYou, null);


        weiShengSuYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_jiXuWeiShengSu_you);
        weiShengSuWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_jiXuWeiShengSu_wu);
        weiShengSuYou.setOther(weiShengSuWu, null);
        weiShengSuWu.setOther(weiShengSuYou, null);

        shuoHuaYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_shuoHua_you);
        shuoHuaWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_shuoHua_wu);
        shuoHuaYou.setOther(shuoHuaWu, null);
        shuoHuaWu.setOther(shuoHuaYou, null);

        huoDongShiJian = (EditText) findViewById(R.id.et_activity_ye3_yue_huWaiHuoDong);

        daShengFanYingYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_daShengFanYing_you);
        daShengFanYingWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_daShengFanYing_wu);
        daShengFanYingYou.setOther(daShengFanYingWu, null);
        daShengFanYingWu.setOther(daShengFanYingYou, null);

        weiXiaoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_faYin_you);
        weiXiaoWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_faYin_wu);
        weiXiaoYou.setOther(weiXiaoWu, null);
        weiXiaoWu.setOther(weiXiaoYou, null);

        zhuShiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_zhuShi_you);
        zhuShiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_zhuShi_wu);
        zhuShiYou.setOther(zhuShiWu, null);
        zhuShiWu.setOther(zhuShiYou, null);

        taiTouYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_taiTou_you);
        taiTouWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_yue_taiTou_wu);
        taiTouYou.setOther(taiTouWu, null);
        taiTouWu.setOther(taiTouYou, null);

        save= (Button) findViewById(R.id.btn_activity_ye3_yue_save);
        save.setOnClickListener(this);
    }

    @Override
    public String convertToJson() {
        return super.convertToJson();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.btn_activity_ye3_yue_save:

                break;
        }
    }
}
