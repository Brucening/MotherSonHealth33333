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

public class YE2SuiActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private EditText manSuiNian, manSuiYue, manSuiRi;
    private EditText ruLeiShu;
    private EditText chiRouShu;
    private CustomYouWuSelect shuCaiYou, shuCaiWu;
    private CustomYouWuSelect shuKouYou, shuKouWu;
    private CustomYouWuSelect woBiHuaHuaYou, woBiHuaHuaWu;
    private CustomYouWuSelect shuoMingChengYou, shuoMingChengWu;
    private CustomYouWuSelect zuoShiQingYou, zuoShiQingWu;
    private CustomYouWuSelect yongShaoYou, yongShaoWu;
    private CustomYouWuSelect shangLouYou, shangLouWu;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye2_sui);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye2_sui_back);
        customActionBar.setOnBackClickListener(this);

        manSuiNian = (EditText) findViewById(R.id.et_activity_ye2_sui_time_nian);
        manSuiYue = (EditText) findViewById(R.id.et_activity_ye2_sui_time_yue);
        manSuiRi = (EditText) findViewById(R.id.et_activity_ye2_sui_time_ri);

        ruLeiShu = (EditText) findViewById(R.id.et_activity_ye2_sui_ruLei);

        chiRouShu = (EditText) findViewById(R.id.et_activity_ye2_sui_chiRouCiShu);

        shuCaiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_shuCai_you);
        shuCaiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_shuCai_wu);
        shuCaiYou.setOther(shuCaiWu, null);
        shuCaiWu.setOther(shuCaiYou, null);

        shuKouYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_shuKou_you);
        shuKouWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_shuKou_wu);
        shuKouYou.setOther(shuKouWu, null);
        shuKouWu.setOther(shuKouYou, null);

        woBiHuaHuaYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_woBiHuaHua_you);
        woBiHuaHuaWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_woBiHuaHua_wu);
        woBiHuaHuaYou.setOther(woBiHuaHuaWu, null);
        woBiHuaHuaWu.setOther(woBiHuaHuaYou, null);

        shuoMingChengYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_shuoMingCheng_you);
        shuoMingChengWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_shuoMingCheng_wu);
        shuoMingChengYou.setOther(shuoMingChengWu, null);
        shuoMingChengWu.setOther(shuoMingChengYou, null);


        zuoShiQingYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_zuoShiQing_you);
        zuoShiQingWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_zuoShiQing_wu);
        zuoShiQingYou.setOther(zuoShiQingWu, null);
        zuoShiQingWu.setOther(zuoShiQingYou, null);

        yongShaoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_yongShao_you);
        yongShaoWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_yongShao_wu);
        yongShaoYou.setOther(yongShaoWu, null);
        yongShaoWu.setOther(yongShaoYou, null);

        shangLouYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_shangLou_you);
        shangLouWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui_shangLou_wu);
        shangLouYou.setOther(shangLouWu, null);
        shangLouWu.setOther(shangLouYou, null);

        save = (Button) findViewById(R.id.btn_activity_ye2_sui_save);
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
            case R.id.btn_activity_ye2_sui_save:

                break;
        }
    }
}
