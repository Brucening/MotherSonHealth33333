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

public class YE1Sui6YueActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private CustomYouWuSelect naShaoYou, naShaoWu;
    private CustomYouWuSelect naBeiZiYou, naBeiZiWu;
    private CustomYouWuSelect wanYou, wanWu;
    private EditText xingZou;
    private CustomYouWuSelect jiaoBaMaYou, jiaoBaMaWu;
    private CustomYouWuSelect zhiRenWuYou, zhiRenWuWu;
    private CustomYouWuSelect muGuangYou, muGuangWu;
    private CustomYouWuSelect duZouYou, duZouWu;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye1_sui6_yue);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye1_sui6_yue_back);
        customActionBar.setOnBackClickListener(this);

        naShaoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_yongShaoZi_you);
        naShaoWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_yongShaoZi_wu);
        naShaoYou.setOther(naShaoWu, null);
        naShaoWu.setOther(naShaoYou, null);

        naBeiZiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_naBeiZi_you);
        naBeiZiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_naBeiZi_wu);
        naBeiZiYou.setOther(naBeiZiWu, null);
        naBeiZiWu.setOther(naBeiZiYou, null);

        xingZou = (EditText) findViewById(R.id.et_activity_ye1_sui6_yue_xingZou);

        wanYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_wan_you);
        wanWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_wan_wu);
        wanYou.setOther(wanWu, null);
        wanWu.setOther(wanYou, null);

        jiaoBaMaYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_jiaoBaMa_you);
        jiaoBaMaWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_jiaoBaMa_wu);
        jiaoBaMaYou.setOther(jiaoBaMaWu, null);
        jiaoBaMaWu.setOther(jiaoBaMaYou, null);

        zhiRenWuYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_zhiRenWu_you);
        zhiRenWuWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_zhiRenWu_wu);
        zhiRenWuYou.setOther(zhiRenWuWu, null);
        zhiRenWuWu.setOther(zhiRenWuYou, null);

        muGuangYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_muGuang_you);
        muGuangWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_muGuang_wu);
        muGuangYou.setOther(muGuangWu, null);
        muGuangWu.setOther(muGuangYou, null);


        duZouYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_duZou_you);
        duZouWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui6_yue_duZou_wu);
        duZouYou.setOther(duZouWu, null);
        duZouWu.setOther(duZouYou, null);

        save = (Button) findViewById(R.id.btn_activity_ye1_sui6_yue_save);
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
            case R.id.btn_activity_ye1_sui6_yue_save:

                break;
        }
    }
}
