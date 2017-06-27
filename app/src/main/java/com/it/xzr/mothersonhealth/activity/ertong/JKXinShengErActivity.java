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

public class JKXinShengErActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private EditText jianChaNian, jianChaYue, jianChaRi, bornTian;
    private EditText tiZhong;
    private EditText tiWen;
    private EditText huXi;
    private CustomYouWuSelect resultYou, resultWu;
    private EditText resultYiChangContent;
    private CustomYouWuSelect zhuanZhenYou, zhuanZhenWu;
    private EditText guanZhu;
    private EditText nextNian, nextYue, nextRi;
    private EditText jianChaDanWei, jianChaZhe;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jkxin_sheng_er);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_jkxin_sheng_er_back);
        customActionBar.setOnBackClickListener(this);

        jianChaNian = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_time_nian);
        jianChaYue = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_time_yue);
        jianChaRi = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_time_ri);
        bornTian = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_time_tian);

        tiZhong = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_tiZhong);

        tiWen = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_wenDu);
        huXi = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_huXi);

        resultYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_jkxin_sheng_er_result_you);
        resultWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_jkxin_sheng_er_result_wu);
        resultYiChangContent = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_result_yiChang_content);
        resultYou.setOther(resultWu, null);
        resultWu.setOther(resultYou, null);

        zhuanZhenYou = (CustomYouWuSelect) findViewById(R.id.cyws_activity_jkxin_sheng_er_zhuanZhen_you);
        zhuanZhenWu = (CustomYouWuSelect) findViewById(R.id.cyws_activity_jkxin_sheng_er_zhuanZhen_wu);
        zhuanZhenYou.setOther(zhuanZhenWu, null);
        zhuanZhenWu.setOther(zhuanZhenYou, null);

        guanZhu = (EditText) findViewById(R.id.cyws_activity_jkxin_sheng_er_guanZhu);

        nextNian = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_time_next_nian);
        nextYue = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_time_next_yue);
        nextRi = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_time_next_ri);

        jianChaDanWei = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_jianChaDanWei);
        jianChaZhe = (EditText) findViewById(R.id.et_activity_jkxin_sheng_er_jianChaZhe);

        save= (Button) findViewById(R.id.btn_activity_jkxin_sheng_er_save);
        save.setOnClickListener(this);
    }

    @Override
    public String convertToJson() {
        // TODO: 2017/6/27 将数据转化为json字符串
        return super.convertToJson();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.btn_activity_jkxin_sheng_er_save:

                break;
        }

    }
}
