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

import static com.it.xzr.mothersonhealth.R.id.cyws_activity_ye3_sui_ruYouErYuan_weiRu;

public class YE3SuiActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private EditText manSuiNian, manSuiYue, manSuiRi;
    private CustomYouWuSelect youErYuanWeiRu, youErYuanRiTuo, youErYuanQuanTuo;
    private CustomYouWuSelect xiJiaoYou, xiJiaoWu;
    private CustomYouWuSelect shuaYaYou, shuaYaWu;
    private CustomYouWuSelect xiShouYou, xiShouWu;
    private CustomYouWuSelect miYanYou, miYanWu;
    private CustomYouWuSelect shuoMingZiYou, shuoMingZiWu;
    private CustomYouWuSelect jiaXiangYou, jiaXiangWu;
    private CustomYouWuSelect huaYuanYou, huaYuanWu;
    private CustomYouWuSelect shuangJiaoTiaoYou, shuangJiaoTiaoWu;
    private Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye3_sui);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye3_sui_back);
        customActionBar.setOnBackClickListener(this);

        manSuiNian = (EditText) findViewById(R.id.et_activity_ye3_sui_time_nian);
        manSuiYue = (EditText) findViewById(R.id.et_activity_ye3_sui_time_yue);
        manSuiRi = (EditText) findViewById(R.id.et_activity_ye3_sui_time_ri);

        youErYuanWeiRu = (CustomYouWuSelect) findViewById(cyws_activity_ye3_sui_ruYouErYuan_weiRu);
        youErYuanRiTuo = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_ruYouErYuan_riTuo);
        youErYuanQuanTuo = (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_ruYouErYuan_quanTuo);
        youErYuanWeiRu.setOther(youErYuanRiTuo,youErYuanQuanTuo);
        youErYuanRiTuo.setOther(youErYuanWeiRu,youErYuanQuanTuo);
        youErYuanQuanTuo.setOther(youErYuanWeiRu,youErYuanRiTuo);

        xiJiaoYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_xiJiao_you);
        xiJiaoWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_xiJiao_wu);
        xiJiaoYou.setOther(xiJiaoWu,null);
        xiJiaoWu.setOther(xiJiaoYou,null);

        shuaYaYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_shuaYa_you);
        shuaYaWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_shuaYa_wu);
        shuaYaYou.setOther(shuaYaWu,null);
        shuaYaWu.setOther(shuaYaYou,null);

        xiShouYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_xiShou_you);
        xiShouWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_xiShou_wu);
        xiShouYou.setOther(xiShouWu,null);
        xiShouWu.setOther(xiShouYou,null);

        miYanYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_miYan_you);
        miYanWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_miYan_wu);
        miYanYou.setOther(miYanWu,null);
        miYanWu.setOther(miYanYou,null);

        shuoMingZiYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_shuoMingZi_you);
        shuoMingZiWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_shuoMingZi_wu);
        shuoMingZiYou.setOther(shuoMingZiWu,null);
        shuoMingZiWu.setOther(shuoMingZiYou,null);

        jiaXiangYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_jiaXiangYouXi_you);
        jiaXiangWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_jiaXiangYouXi_wu);
        jiaXiangYou.setOther(jiaXiangWu,null);
        jiaXiangWu.setOther(jiaXiangYou,null);

        huaYuanYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_huaYuan_you);
        huaYuanWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_huaYuan_wu);
        huaYuanYou.setOther(huaYuanWu,null);
        huaYuanWu.setOther(huaYuanYou,null);

        shuangJiaoTiaoYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_shuangJiaoTiao_you);
        shuangJiaoTiaoWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye3_sui_shuangJiaoTiao_wu);
        shuangJiaoTiaoYou.setOther(shuangJiaoTiaoWu,null);
        shuangJiaoTiaoWu.setOther(shuangJiaoTiaoYou,null);

        save= (Button) findViewById(R.id.btn_activity_ye3_sui_save);
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
            case R.id.btn_activity_ye3_sui_save:

                break;
        }
    }
}
