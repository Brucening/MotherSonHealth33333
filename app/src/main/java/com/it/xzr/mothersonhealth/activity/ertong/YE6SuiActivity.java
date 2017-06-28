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

public class YE6SuiActivity extends BaseActivity {
    private CustomActionBar customActionBar;
    private EditText manSuiNian,manSuiYue,manSuiRi;
    private CustomYouWuSelect jiaWuYou,jiaWuWu;
    private CustomYouWuSelect fenXiangYou,fenXiangWu;
    private CustomYouWuSelect zunShouYou,zunShouWu;
    private CustomYouWuSelect mingZiYou,mingZiWu;
    private CustomYouWuSelect biaoDaGanShouYou,biaoDaGanShouWu;
    private CustomYouWuSelect jiaoSeBanYanYou,jiaoSeBanYanWu;
    private CustomYouWuSelect fangXingYou,fangXingWu;
    private CustomYouWuSelect benPaoYou,benPaoWu;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye6_sui);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        customActionBar = (CustomActionBar) findViewById(R.id.cab_activity_ye6_sui_back);
        customActionBar.setOnBackClickListener(this);

        manSuiNian= (EditText) findViewById(R.id.et_activity_ye6_sui_time_year);
        manSuiYue= (EditText) findViewById(R.id.et_activity_ye6_sui_time_yue);
        manSuiRi= (EditText) findViewById(R.id.et_activity_ye6_sui_time_ri);

        jiaWuYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_jiaWu_you);
        jiaWuWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_jiaWu_wu);
        jiaWuYou.setOther(jiaWuWu,null);
        jiaWuWu.setOther(jiaWuYou,null);

        fenXiangYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_fenXiangZhangBei_you);
        fenXiangWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_fenXiangZhangBei_wu);
        fenXiangYou.setOther(fenXiangWu,null);
        fenXiangWu.setOther(fenXiangYou,null);

         zunShouYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_zunShouGuiZe_you);
        zunShouWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_zunShouGuiZe_wu);
        zunShouYou.setOther(zunShouWu,null);
        zunShouWu.setOther(zunShouYou,null);

         mingZiYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_xieZiJiMingZi_you);
        mingZiWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_xieZiJiMingZi_wu);
        mingZiYou.setOther(mingZiWu,null);
        mingZiWu.setOther(mingZiYou,null);

         biaoDaGanShouYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_biaoDaGanShou_you);
        biaoDaGanShouWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_biaoDaGanShou_wu);
        biaoDaGanShouYou.setOther(biaoDaGanShouWu,null);
        biaoDaGanShouWu.setOther(biaoDaGanShouYou,null);

         jiaoSeBanYanYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_jiaoSeBanYan_you);
        jiaoSeBanYanWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_jiaoSeBanYan_wu);
        jiaoSeBanYanYou.setOther(jiaoSeBanYanWu,null);
        jiaoSeBanYanWu.setOther(jiaoSeBanYanYou,null);

         fangXingYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_huaFangXing_you);
        fangXingWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_huaFangXing_wu);
        fangXingYou.setOther(fangXingWu,null);
        fangXingWu.setOther(fangXingYou,null);

         benPaoYou= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_benPao_you);
        benPaoWu= (CustomYouWuSelect) findViewById(R.id.cyws_activity_ye6_sui_benPao_wu);
        benPaoYou.setOther(benPaoWu,null);
        benPaoWu.setOther(benPaoYou,null);

        save= (Button) findViewById(R.id.btn_activity_ye6_sui_save);
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
            case R.id.btn_activity_ye6_sui_save:

                break;
        }
    }
}
