package com.it.xzr.mothersonhealth.fragment.ertong;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.activity.ertong.JK1Sui6YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK1SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK1YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK2Sui6YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK2SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK3SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK3YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK4SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK5SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK6SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK6YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JK8YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.JKXinShengErActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE1Sui6YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE1SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE1YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE2Sui6YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE2SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE3SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE3YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE4SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE5SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE6SuiActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE6YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YE8YueActivity;
import com.it.xzr.mothersonhealth.activity.ertong.YEXinShengErActivity;
import com.it.xzr.mothersonhealth.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecordListFragment extends BaseFragment {
    private RelativeLayout xinShengErYE, yue1YE, yue3YE, yue6YE, yue8YE;
    private RelativeLayout xinShengErJK, yue1JK, yue3JK, yue6JK, yue8JK;
    private RelativeLayout sui1YE, sui1yue6YE, sui2YE, sui2yue6YE;
    private RelativeLayout sui1JK, sui1yue6JK, sui2JK, sui2yue6JK;
    private RelativeLayout sui3YE, sui4YE, sui5YE, sui6YE;
    private RelativeLayout sui3JK, sui4JK, sui5JK, sui6JK;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_record_list, container, false);
        initWidget(inflate);
        initData();
        return inflate;
    }

    @Override
    public void initWidget(View view) {
        xinShengErYE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_xinShengEr);
        xinShengErJK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_xinShengEr);
        yue1YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_1yue);
        yue1JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_1yue);
        yue3YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_3yue);
        yue3JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_3yue);
        yue6YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_6yue);
        yue6JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_6yue);
        yue8YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_8yue);
        yue8JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_8yue);
        sui1YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_1sui);
        sui1JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_1sui);
        sui1yue6YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_1sui6yue);
        sui1yue6JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_1sui6yue);
        sui2YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_2sui);
        sui2JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_2sui);
        sui2yue6YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_2sui6yue);
        sui2yue6JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_2sui6yue);
        sui3YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_3sui);
        sui3JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_3sui);
        sui4YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_4sui);
        sui4JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_4sui);
        sui5YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_5sui);
        sui5JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_5sui);
        sui6YE = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_yuEr_6sui);
        sui6JK = (RelativeLayout) view.findViewById(R.id.rl_fragment_record_list_ertong_health_6sui);
        ;

        xinShengErYE.setOnClickListener(this);
        xinShengErJK.setOnClickListener(this);
        yue1YE.setOnClickListener(this);
        yue1JK.setOnClickListener(this);
        yue3YE.setOnClickListener(this);
        yue3JK.setOnClickListener(this);
        yue6YE.setOnClickListener(this);
        yue6JK.setOnClickListener(this);
        yue8YE.setOnClickListener(this);
        yue8JK.setOnClickListener(this);
        sui1YE.setOnClickListener(this);
        sui1JK.setOnClickListener(this);
        sui1yue6YE.setOnClickListener(this);
        sui1yue6JK.setOnClickListener(this);
        sui2YE.setOnClickListener(this);
        sui2JK.setOnClickListener(this);
        sui2yue6YE.setOnClickListener(this);
        sui2yue6JK.setOnClickListener(this);
        sui3YE.setOnClickListener(this);
        sui3JK.setOnClickListener(this);
        sui4YE.setOnClickListener(this);
        sui4JK.setOnClickListener(this);
        sui5YE.setOnClickListener(this);
        sui5JK.setOnClickListener(this);
        sui6YE.setOnClickListener(this);
        sui6JK.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.rl_fragment_record_list_ertong_yuEr_xinShengEr:
                Intent intent1 = new Intent();
                intent1.setClass(getActivity(), YEXinShengErActivity.class);
                startActivity(intent1);
                break;
            case R.id.rl_fragment_record_list_ertong_health_xinShengEr:
                Intent intent2 = new Intent();
                intent2.setClass(getActivity(), JKXinShengErActivity.class);
                startActivity(intent2);
                break;
            case R.id.rl_fragment_record_list_ertong_yuEr_1yue:
                Intent intent3 = new Intent();
                intent3.setClass(getActivity(), YE1YueActivity.class);
                startActivity(intent3);
                break;
            case R.id.rl_fragment_record_list_ertong_health_1yue:
                Intent intent4 = new Intent();
                intent4.setClass(getActivity(), JK1YueActivity.class);
                startActivity(intent4);
                break;
            case R.id.rl_fragment_record_list_ertong_yuEr_3yue:
                Intent intent5 = new Intent();
                intent5.setClass(getActivity(), YE3YueActivity.class);
                startActivity(intent5);
                break;
            case R.id.rl_fragment_record_list_ertong_health_3yue:
                Intent intent6 = new Intent();
                intent6.setClass(getActivity(), JK3YueActivity.class);
                startActivity(intent6);
                break;
            case R.id.rl_fragment_record_list_ertong_yuEr_6yue:
                Intent intent7 = new Intent();
                intent7.setClass(getActivity(), YE6YueActivity.class);
                startActivity(intent7);
                break;
            case R.id.rl_fragment_record_list_ertong_health_6yue:
                Intent intent8 = new Intent();
                intent8.setClass(getActivity(), JK6YueActivity.class);
                startActivity(intent8);
                break;
            case R.id.rl_fragment_record_list_ertong_yuEr_8yue:
                Intent intent9 = new Intent();
                intent9.setClass(getActivity(), YE8YueActivity.class);
                startActivity(intent9);
                break;
            case R.id.rl_fragment_record_list_ertong_health_8yue:
                Intent intent10 = new Intent();
                intent10.setClass(getActivity(), JK8YueActivity.class);
                startActivity(intent10);
                break;
            case R.id.rl_fragment_record_list_ertong_yuEr_1sui:
                Intent intent11 = new Intent();
                intent11.setClass(getActivity(), YE1SuiActivity.class);
                startActivity(intent11);
                break;
            case R.id.rl_fragment_record_list_ertong_health_1sui:
                Intent intent12 = new Intent();
                intent12.setClass(getActivity(), JK1SuiActivity.class);
                startActivity(intent12);
                break;
            case R.id.rl_fragment_record_list_ertong_yuEr_1sui6yue:
                Intent intent13 = new Intent();
                intent13.setClass(getActivity(), YE1Sui6YueActivity.class);
                startActivity(intent13);
                break;
            case R.id.rl_fragment_record_list_ertong_health_1sui6yue:
                Intent intent14 = new Intent();
                intent14.setClass(getActivity(), JK1Sui6YueActivity.class);
                startActivity(intent14);
                break;
            case R.id.rl_fragment_record_list_ertong_yuEr_2sui:
                Intent intent15 = new Intent();
                intent15.setClass(getActivity(), YE2SuiActivity.class);
                startActivity(intent15);
                break;
            case R.id.rl_fragment_record_list_ertong_health_2sui:
                Intent intent16 = new Intent();
                intent16.setClass(getActivity(), JK2SuiActivity.class);
                startActivity(intent16);
                break;
            case R.id.rl_fragment_record_list_ertong_yuEr_2sui6yue:
                Intent intent17 = new Intent();
                intent17.setClass(getActivity(), YE2Sui6YueActivity.class);
                startActivity(intent17);
                break;
            case R.id.rl_fragment_record_list_ertong_health_2sui6yue:
                Intent intent18 = new Intent();
                intent18.setClass(getActivity(), JK2Sui6YueActivity.class);
                startActivity(intent18);
                break;

            case R.id.rl_fragment_record_list_ertong_yuEr_3sui:
                Intent intent19 = new Intent();
                intent19.setClass(getActivity(), YE3SuiActivity.class);
                startActivity(intent19);
                break;
            case R.id.rl_fragment_record_list_ertong_health_3sui:
                Intent intent20 = new Intent();
                intent20.setClass(getActivity(), JK3SuiActivity.class);
                startActivity(intent20);
                break;


            case R.id.rl_fragment_record_list_ertong_yuEr_4sui:
                Intent intent21 = new Intent();
                intent21.setClass(getActivity(), YE4SuiActivity.class);
                startActivity(intent21);
                break;
            case R.id.rl_fragment_record_list_ertong_health_4sui:
                Intent intent22 = new Intent();
                intent22.setClass(getActivity(), JK4SuiActivity.class);
                startActivity(intent22);
                break;


            case R.id.rl_fragment_record_list_ertong_yuEr_5sui:
                Intent intent23 = new Intent();
                intent23.setClass(getActivity(), YE5SuiActivity.class);
                startActivity(intent23);
                break;
            case R.id.rl_fragment_record_list_ertong_health_5sui:
                Intent intent24 = new Intent();
                intent24.setClass(getActivity(), JK5SuiActivity.class);
                startActivity(intent24);
                break;


            case R.id.rl_fragment_record_list_ertong_yuEr_6sui:
                Intent intent25 = new Intent();
                intent25.setClass(getActivity(), YE6SuiActivity.class);
                startActivity(intent25);
                break;
            case R.id.rl_fragment_record_list_ertong_health_6sui:
                Intent intent26 = new Intent();
                intent26.setClass(getActivity(), JK6SuiActivity.class);
                startActivity(intent26);
                break;
        }

    }
}
