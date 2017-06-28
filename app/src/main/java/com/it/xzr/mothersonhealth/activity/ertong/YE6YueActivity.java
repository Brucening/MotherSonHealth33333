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

public class YE6YueActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private EditText fuShiYue, fuShiRi;
    private EditText fanShenYue, fanShenRi;
    private EditText wanJu;
    private CustomYouWuSelect wanYou, wanWu;
    private CustomYouWuSelect xiaoYou, xiaoWu;
    private CustomYouWuSelect zhuaWuPinYou, zhuaWuPinWu;
    private CustomYouWuSelect woQuanYou, woQuanWu;
    private CustomYouWuSelect fuZuoYou, fuZuoWu;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye6_yue);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye6_yue_back);
        customActionBar.setOnBackClickListener(this);

        fuShiYue = (EditText) findViewById(R.id.et_activity_ye6_yue_tianJiaFuShi_yue);
        fuShiRi = (EditText) findViewById(R.id.et_activity_ye6_yue_tianJiaFuShi_ri);

        fanShenYue = (EditText) findViewById(R.id.et_activity_ye6_yue_fanSheng_yue);
        fanShenRi = (EditText) findViewById(R.id.et_activity_ye6_yue_fanSheng_ri);

        wanJu = (EditText) findViewById(R.id.et_activity_ye6_yue_zhunBeiWanJu);

        wanYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_yue_wan_you);
        wanWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_yue_wan_wu);
        wanYou.setOther(wanWu, null);
        wanWu.setOther(wanYou, null);

        xiaoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_yue_xiao_you);
        xiaoWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_yue_xiao_wu);
        xiaoYou.setOther(xiaoWu, null);
        xiaoWu.setOther(xiaoYou, null);

        zhuaWuPinYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_yue_zhuaWuPin_you);
        zhuaWuPinWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_yue_zhuaWuPin_wu);
        zhuaWuPinYou.setOther(zhuaWuPinWu, null);
        zhuaWuPinWu.setOther(zhuaWuPinYou, null);

        woQuanYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_yue_woQuan_you);
        woQuanWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_yue_woQuan_wu);
        woQuanYou.setOther(woQuanWu, null);
        woQuanWu.setOther(woQuanYou, null);

        fuZuoYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_yue_fuZuo_you);
        fuZuoWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_yue_fuZuo_wu);
        fuZuoYou.setOther(fuZuoWu, null);
        fuZuoWu.setOther(fuZuoYou, null);

        save= (Button) findViewById(R.id.btn_activity_ye6_yue_save);
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
            case R.id.btn_activity_ye6_yue_save:

                break;
        }
    }
}
