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

public class YE2Sui6YueActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private CustomYouWuSelect tiaoShiYou, tiaoShiWu;
    private EditText chuYaShu;
    private EditText shenTiBuWeiShu;
    private CustomYouWuSelect kanShuYou, kanShuWu;
    private CustomYouWuSelect shuoBaMaYou, shuoBaMaWu;
    private CustomYouWuSelect zhiRenWuYou, zhiRenWuWu;
    private CustomYouWuSelect muGuangYou, muGuangWu;
    private CustomYouWuSelect duZouYou, duZouWu;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye2_sui6_yue);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye2_sui6_yue_back);
        customActionBar.setOnBackClickListener(this);

        tiaoShiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_tiaoShi_you);
        tiaoShiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_tiaoShi_wu);
        tiaoShiYou.setOther(tiaoShiWu,null);
        tiaoShiWu.setOther(tiaoShiYou,null);

        chuYaShu = (EditText) findViewById(R.id.et_activity_ye2_sui6_yue_chuYa);

        shenTiBuWeiShu = (EditText) findViewById(R.id.et_activity_ye2_sui6_yue_shenTiBuWei);

        kanShuYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_kanShu_you);
        kanShuWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_kanShu_wu);
        kanShuYou.setOther(kanShuWu,null);
        kanShuWu.setOther(kanShuYou,null);

        shuoBaMaYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_shuoBaMa_you);
        shuoBaMaWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_shuoBaMa_wu);
        shuoBaMaYou.setOther(shuoBaMaWu,null);
        shuoBaMaWu.setOther(shuoBaMaYou,null);

        zhiRenWuYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_zhiRenWu_you);
        zhiRenWuWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_zhiRenWu_wu);
        zhiRenWuYou.setOther(zhiRenWuWu,null);
        zhiRenWuWu.setOther(zhiRenWuYou,null);

        muGuangYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_muGuang_you);
        muGuangWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_muGuang_wu);
        muGuangYou.setOther(muGuangWu,null);
        muGuangWu.setOther(muGuangYou,null);

        duZouYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_duZou_you);
        duZouWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye2_sui6_yue_duZou_wu);
        duZouYou.setOther(duZouWu,null);
        duZouWu.setOther(duZouYou,null);

        save= (Button) findViewById(R.id.btn_activity_ye2_sui6_yue_save);
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
            case R.id.btn_activity_ye2_sui6_yue_save:

                break;
        }
    }
}
