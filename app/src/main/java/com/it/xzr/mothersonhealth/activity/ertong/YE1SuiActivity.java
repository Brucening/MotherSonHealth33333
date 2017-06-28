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

public class YE1SuiActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private EditText manSuiNian, manSuiYue, manSuiRi;
    private CustomYouWuSelect weiNaiYou, weiNaiWu;
    private CustomYouWuSelect chiFanYou, chiFanWu;
    private EditText chiFanCiShu;
    private EditText chuYaShu;
    private CustomYouWuSelect fanYingYou, fanYingWu;
    private CustomYouWuSelect moFangYou, moFangWu;
    private CustomYouWuSelect duiNieYou, duiNieWu;
    private CustomYouWuSelect zhanLiYou, zhanLiWu;
    private Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye1_sui);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye1_sui_back);
        customActionBar.setOnBackClickListener(this);

        manSuiNian = (EditText) findViewById(R.id.et_activity_ye1_sui_time_nian);
        manSuiYue = (EditText) findViewById(R.id.et_activity_ye1_sui_time_yue);
        manSuiRi = (EditText) findViewById(R.id.et_activity_ye1_sui_time_ri);

        weiNaiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_muRu_you);
        weiNaiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_muRu_wu);
        weiNaiYou.setOther(weiNaiWu, null);
        weiNaiWu.setOther(weiNaiYou, null);

        chiFanYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_chiFan_you);
        chiFanWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_chiFan_wu);
        chiFanYou.setOther(chiFanWu, null);
        chiFanWu.setOther(chiFanYou, null);

        chiFanCiShu = (EditText) findViewById(R.id.et_activity_ye1_sui_chiFan);

        chuYaShu = (EditText) findViewById(R.id.et_activity_ye1_sui_chuYaShu);

        fanYingYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_mingZiFanYing_you);
        fanYingWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_mingZiFanYing_wu);
        fanYingYou.setOther(fanYingWu, null);
        fanYingWu.setOther(fanYingYou, null);

        moFangYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_moFang_you);
        moFangWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_moFang_wu);
        moFangYou.setOther(moFangWu, null);
        moFangWu.setOther(moFangYou, null);

        duiNieYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_duiNie_you);
        duiNieWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_duiNie_wu);
        duiNieYou.setOther(duiNieWu, null);
        duiNieWu.setOther(duiNieYou, null);

        zhanLiYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_zhanLi_you);
        zhanLiWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye1_sui_zhanLi_wu);
        zhanLiWu.setOther(zhanLiYou, null);
        zhanLiYou.setOther(zhanLiWu, null);

        save= (Button) findViewById(R.id.btn_activity_ye1_sui_save);
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
            case R.id.btn_activity_ye1_sui_save:

                break;
        }
    }


}
