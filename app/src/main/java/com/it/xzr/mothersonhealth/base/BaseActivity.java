package com.it.xzr.mothersonhealth.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.view.CustomYouWuSelect;


public class BaseActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    public void initWidget() {

    }

    public void initData() {

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    /**
     * 检查两个自定义checkbox的选择状态，并返回状态码。0--两个都没有选择；1--选择有的的checkbox；2--选择了没有（否定）的checkbox
     *
     * @param you   含肯定意思的checkbox
     * @param wu    含否定意思的checkbox
     * @return  两个自定义checkbox的选择状态
     */
    public String getCheckedState(CustomYouWuSelect you, CustomYouWuSelect wu) {
        if (!you.getState() && !wu.getState()) {
            return "0";
        } else if (you.getState() && !wu.getState()) {
            return "1";
        } else if (!you.getState() && wu.getState()) {
            return "2";
        } else if (!you.getState() && wu.getState()) {
            return "3";
        }
        return null;
    }

    /**
     * 将所有的带提交的数据转换为json格式
     *
     * @return json格式的字符串
     */
    public String convertToJson() {
        return null;
    }

}
