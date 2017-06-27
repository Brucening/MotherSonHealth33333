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

public class YE1YueActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private EditText manYueNian, manYueYue, manYueRi;
    private EditText qiDaiTuoLuo;
    private EditText huangRanXiaoTui;
    private EditText chiNaiCiShu, xiaoBianCiShu, daBianCiShu;
    private CustomYouWuSelect muRuWeiYang, hunHeWeiYang, renGongWeiYang;
    private CustomYouWuSelect chiNaiYou, chiNaiWu;
    private CustomYouWuSelect kuQiYou, kuQiWu;
    private CustomYouWuSelect kuNaoYou, kuNaoWu;
    private CustomYouWuSelect weiShengSuYou, weiShengSuWu;
    private Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye1_yue);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye1_yue_back);
        customActionBar.setOnBackClickListener(this);

        manYueNian = (EditText) findViewById(R.id.et_activity_ye1_yue_time_nian);
        manYueYue = (EditText) findViewById(R.id.et_activity_ye1_yue_time_yue);
        manYueRi = (EditText) findViewById(R.id.et_activity_ye1_yue_time_ri);

        qiDaiTuoLuo = (EditText) findViewById(R.id.et_activity_ye1_yue_qiDai);

        huangRanXiaoTui = (EditText) findViewById(R.id.et_activity_ye1_yue_huangRanXiaoTui);

        chiNaiCiShu = (EditText) findViewById(R.id.et_activity_ye1_yue_chiNai);
        xiaoBianCiShu = (EditText) findViewById(R.id.et_activity_ye1_yue_xiaoBian);
        daBianCiShu = (EditText) findViewById(R.id.et_activity_ye1_yue_daBian);

        muRuWeiYang = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_weiYangFangShi_muRu);
        hunHeWeiYang = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_weiYangFangShi_hunHe);
        renGongWeiYang = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_weiYangFangShi_renGong);
        muRuWeiYang.setOther(hunHeWeiYang, renGongWeiYang);
        hunHeWeiYang.setOther(muRuWeiYang, renGongWeiYang);
        renGongWeiYang.setOther(muRuWeiYang, hunHeWeiYang);

        chiNaiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_chiNai_you);
        chiNaiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_chiNai_wu);
        chiNaiYou.setOther(chiNaiWu, null);
        chiNaiWu.setOther(chiNaiYou, null);

        kuQiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_kuQi_you);
        kuQiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_kuQi_wu);
        kuQiYou.setOther(kuQiWu, null);
        kuQiWu.setOther(kuQiYou, null);

        kuNaoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_kuNao_you);
        kuNaoWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_kuNao_wu);
        kuNaoYou.setOther(kuNaoWu, null);
        kuNaoWu.setOther(kuNaoYou, null);

        weiShengSuYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_weiShengSu_you);
        weiShengSuWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_yue_weiShengSu_wu);
        weiShengSuYou.setOther(weiShengSuWu, null);
        weiShengSuWu.setOther(weiShengSuYou, null);

        save = (Button) findViewById(R.id.btn_activity_ye1_yue_save);
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
            case R.id.btn_activity_ye1_yue_save:

                break;
        }
    }
}
