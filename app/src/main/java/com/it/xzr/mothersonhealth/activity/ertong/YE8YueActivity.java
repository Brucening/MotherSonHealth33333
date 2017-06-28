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

public class YE8YueActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private EditText addMeat;
    private EditText addEgg;
    private EditText firstTeeth;
    private CustomYouWuSelect duoMaoMaoYou, duoMaoMaoWu;
    private CustomYouWuSelect responseToSoundYou, responseToSoundWu;
    private CustomYouWuSelect quFenShengShuRenYou, quFenShengShuRenWu;
    private CustomYouWuSelect chuanDiWanJuYou, chuanDiWanJuWu;
    private CustomYouWuSelect duZuoYou, duZuoWu;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye8_yue);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye8_yue_back);
        customActionBar.setOnBackClickListener(this);

        addMeat = (EditText) findViewById(R.id.et_activity_ye8_yue_addMeat);

        addEgg = (EditText) findViewById(R.id.et_activity_ye8_yue_addEgg);

        firstTeeth = (EditText) findViewById(R.id.et_activity_ye8_yue_firstTeeth);

        duoMaoMaoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye8_yue_duoMaoMao_you);
        duoMaoMaoWu = (CustomYouWuSelect) findViewById(R.id.et_activity_ye8_yue_duoMaoMao_wu);
        duoMaoMaoYou.setOther(duoMaoMaoWu, null);
        duoMaoMaoWu.setOther(duoMaoMaoYou, null);

        responseToSoundYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye8_yue_responseToSound_you);
        responseToSoundWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye8_yue_responseToSound_wu);
        responseToSoundYou.setOther(responseToSoundWu, null);
        responseToSoundWu.setOther(responseToSoundYou, null);

        quFenShengShuRenYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye8_yue_quFenShengShuRen_wu);
        quFenShengShuRenWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye8_yue_quFenShengShuRen_you);
        quFenShengShuRenYou.setOther(quFenShengShuRenWu, null);
        quFenShengShuRenWu.setOther(quFenShengShuRenYou, null);

        chuanDiWanJuYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye8_yue_chuanDiWanJu_you);
        chuanDiWanJuWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye8_yue_chuanDiWanJu_wu);
        chuanDiWanJuYou.setOther(chuanDiWanJuWu, null);
        chuanDiWanJuWu.setOther(chuanDiWanJuYou, null);

        duZuoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye8_yue_duZuo_you);
        duZuoWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye8_yue_duZuo_wu);
        duZuoYou.setOther(duZuoWu, null);
        duZuoWu.setOther(duZuoYou, null);

        save = (Button) findViewById(R.id.btn_activity_ye8_yue_save);
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
            case R.id.btn_activity_ye8_yue_save:

                break;
        }
    }
}
