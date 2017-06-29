package com.it.xzr.mothersonhealth.fragment.yunqian;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.it.xzr.mothersonhealth.R;


/**
 * Created by GN on 2017/5/25.
 */

public class MotherFragment extends Fragment {
    private EditText editText_name,editText_age,editText_zhiye,
            editText_id,editText_huji,editText_danwei,editText_dizhi,editText_tel;
    private TextView editText_minzu;
    private ArrayAdapter<String> adapter;
    private String[] datas={"请选择","汉族","蒙族","回族","藏族","维族","苗族","彝族","壮族","布依族","朝鲜族",
            "满族","瑶族","畲族","土家族","哈尼族","哈萨克族","黎族","傈傈族","佤族","舍族","拉祜族","水族","东乡族","纳西族",
            "景颇族","土族","达翰尔族","仫佬族","羌族","布朗族","撒拉族","仡佬族","锡伯族","阿昌族","普米族","塔吉克族","乌兹别克族",
            "俄罗斯族","鄂温克族","德昂族","保安族","京族","塔塔尔族","独龙族","鄂伦春族","赫哲族","珞巴族","基诺族族","*未识别","*外入中籍","侗族",
            "傣族","高山族","柯尔克孜族","毛南族","怒族","裕固族","门巴族"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xinxi_mother,container,false);
        initData(view);
        onclick(view);
        return view;
    }

    private void onclick(View view) {
        editText_minzu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"点击了请选择",Toast.LENGTH_LONG).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setTitle("提示:");
                builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getActivity(),"你点击了第"+i+"个item",Toast.LENGTH_LONG).show();
                    }
                });
                builder.show();

            }
        });
    }

    private void initData(View view) {
        editText_name = (EditText) view.findViewById(R.id.edittext_mother_name);
        editText_age = (EditText) view.findViewById(R.id.edittext_mother_age);
        editText_zhiye = (EditText) view.findViewById(R.id.edittext_mother_zhiye);
        editText_minzu = (TextView) view.findViewById(R.id.edittext_mother_minzu);
        editText_id = (EditText) view.findViewById(R.id.edittext_mother_id);
        editText_huji = (EditText) view.findViewById(R.id.edittext_mother_huji);
        editText_danwei = (EditText) view.findViewById(R.id.edittext_mother_danwei);
        editText_dizhi = (EditText) view.findViewById(R.id.edittext_mother_dizhi);
        editText_tel = (EditText) view.findViewById(R.id.edittext_mother_tel);
        editText_age.setSelection(editText_age.getText().length());
        editText_zhiye.setSelection(editText_zhiye.getText().length());
        editText_id.setSelection(editText_id.getText().length());
        editText_huji.setSelection(editText_huji.getText().length());
        editText_danwei.setSelection(editText_danwei.getText().length());
        editText_dizhi.setSelection(editText_dizhi.getText().length());
        editText_tel.setSelection(editText_tel.getText().length());
        editText_name.setSelection(editText_name.getText().length());

        adapter = new ArrayAdapter<String>(getActivity(),R.layout.simple_list_mother,datas);

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
