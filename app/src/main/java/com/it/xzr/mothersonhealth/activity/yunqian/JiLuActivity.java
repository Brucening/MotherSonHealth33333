package com.it.xzr.mothersonhealth.activity.yunqian;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.base.BaseActivity;


/**
 * Created by GN on 2017/5/26.
 */

public class JiLuActivity extends BaseActivity {
    private EditText edittext_mother_name,edittext_mother_age,edittext_mother_id,
            edittext_mother_dizhi,edittext_mother_tel,edittext_mother_hunling,
            edittext_mother_yunling,edittext_mother_shengao,edittext_mother_tizhong,
            edittext_mother_bmi,edittext_father_name,edittext_father_age,edittext_father_id,
            edittext_father_dizhi,edittext_father_tel,edittext_father_hunling,
            edittext_father_yunling,edittext_father_shengao,edittext_father_tizhong,
            edittext_father_bmi,edittext_yunqian_jilu_ganxiang;
    private CheckBox checkbox_mother_zhengchang,checkbox_mother_chaozhong,checkbox_mother_feipang,
            checkbox_mother_chaoqing,checkbox_father_zhengchang,checkbox_father_chaozhong,
            checkbox_father_feipang,checkbox_father_chaoqing;
    private RadioButton radiobutton_mother_jieguo,radiobutton_mother_jibing,
            radiobutton_father_jieguo,radiobutton_father_jibing;
    private Button but_yunqian_jilu_beiyun_tijiao;
    public String edittext_mother_Name,edittext_mother_Age,edittext_mother_Id,
            edittext_mother_Dizhi,edittext_mother_Tel,edittext_mother_Hunling,
            edittext_mother_Yunling,edittext_mother_Shengao,edittext_mother_Tizhong,
            edittext_mother_Bmi,edittext_father_Name,edittext_father_Age,edittext_father_Id,
            edittext_father_Dizhi,edittext_father_Tel,edittext_father_Hunling,
            edittext_father_Yunling,edittext_father_Shengao,edittext_father_Tizhong,
            edittext_father_Bmi,edittext_yunqian_jilu_Ganxiang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jilu);
        initWidget();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        edittext_mother_name = (EditText) findViewById(R.id.edittext_mother_name);
        edittext_mother_age = (EditText) findViewById(R.id.edittext_mother_age);
        edittext_mother_id = (EditText) findViewById(R.id.edittext_mother_id);
        edittext_mother_dizhi = (EditText) findViewById(R.id.edittext_mother_dizhi);
        edittext_mother_tel = (EditText) findViewById(R.id.edittext_mother_tel);
        edittext_mother_hunling = (EditText) findViewById(R.id.edittext_mother_hunling);
        edittext_mother_yunling = (EditText) findViewById(R.id.edittext_mother_yunling);
        edittext_mother_shengao = (EditText) findViewById(R.id.edittext_mother_shengao);
        edittext_mother_tizhong = (EditText) findViewById(R.id.edittext_mother_tizhong);
        edittext_mother_bmi = (EditText) findViewById(R.id.edittext_mother_bmi);
        edittext_father_age = (EditText) findViewById(R.id.edittext_father_age);
        edittext_father_id = (EditText) findViewById(R.id.edittext_father_id);
        edittext_father_dizhi = (EditText) findViewById(R.id.edittext_father_dizhi);
        edittext_father_tel = (EditText) findViewById(R.id.edittext_father_tel);
        edittext_father_name = (EditText) findViewById(R.id.edittext_father_name);
        edittext_father_hunling = (EditText) findViewById(R.id.edittext_father_hunling);
        edittext_father_yunling = (EditText) findViewById(R.id.edittext_father_yunling);
        edittext_father_shengao = (EditText) findViewById(R.id.edittext_father_shengao);
        edittext_father_tizhong = (EditText) findViewById(R.id.edittext_father_tizhong);
        edittext_father_bmi = (EditText) findViewById(R.id.edittext_father_bmi);
        edittext_yunqian_jilu_ganxiang = (EditText) findViewById(R.id.edittext_yunqian_jilu_ganxiang);

        checkbox_mother_zhengchang = (CheckBox) findViewById(R.id.checkbox_mother_zhengchang);
        checkbox_mother_chaozhong = (CheckBox) findViewById(R.id.checkbox_mother_chaozhong);
        checkbox_mother_feipang = (CheckBox) findViewById(R.id.checkbox_mother_feipang);
        checkbox_mother_chaoqing = (CheckBox) findViewById(R.id.checkbox_mother_chaoqing);
        checkbox_father_zhengchang = (CheckBox) findViewById(R.id.checkbox_father_zhengchang);
        checkbox_father_chaozhong = (CheckBox) findViewById(R.id.checkbox_father_chaozhong);
        checkbox_father_feipang = (CheckBox) findViewById(R.id.checkbox_father_feipang);
        checkbox_father_chaoqing = (CheckBox) findViewById(R.id.checkbox_father_chaoqing);

        radiobutton_mother_jieguo = (RadioButton) findViewById(R.id.radiobutton_mother_jieguo);
        radiobutton_mother_jibing = (RadioButton) findViewById(R.id.radiobutton_mother_jibing);
        radiobutton_father_jieguo = (RadioButton) findViewById(R.id.radiobutton_father_jieguo);
        radiobutton_father_jibing = (RadioButton) findViewById(R.id.radiobutton_father_jibing);

        but_yunqian_jilu_beiyun_tijiao = (Button) findViewById(R.id.but_yunqian_jilu_beiyun_tijiao);
        but_yunqian_jilu_beiyun_tijiao.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.but_yunqian_jilu_beiyun_tijiao:
                edittext_mother_Name=edittext_mother_name.getText().toString();
                edittext_mother_Age=edittext_mother_age.getText().toString();
                edittext_mother_Id=edittext_mother_id.getText().toString();
                edittext_mother_Dizhi=edittext_mother_dizhi.getText().toString();
                edittext_mother_Tel=edittext_mother_tel.getText().toString();
                edittext_mother_Hunling=edittext_mother_hunling.getText().toString();
                edittext_mother_Yunling=edittext_mother_yunling.getText().toString();
                edittext_mother_Shengao=edittext_mother_shengao.getText().toString();
                edittext_mother_Tizhong=edittext_mother_tizhong.getText().toString();
                edittext_mother_Bmi=edittext_mother_bmi.getText().toString();
                edittext_father_Age=edittext_father_age.getText().toString();
                edittext_father_Id=edittext_father_id.getText().toString();
                edittext_father_Dizhi=edittext_father_dizhi.getText().toString();
                edittext_father_Tel=edittext_father_tel.getText().toString();
                edittext_father_Name=edittext_father_name.getText().toString();
                edittext_father_Hunling=edittext_father_hunling.getText().toString();
                edittext_father_Yunling=edittext_father_yunling.getText().toString();
                edittext_father_Shengao=edittext_father_shengao.getText().toString();
                edittext_father_Tizhong=edittext_father_tizhong.getText().toString();
                edittext_father_Bmi=edittext_father_bmi.getText().toString();
                edittext_yunqian_jilu_Ganxiang=edittext_yunqian_jilu_ganxiang.getText().toString();
                break;
        }
    }
}
