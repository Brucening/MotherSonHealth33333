package com.it.xzr.mothersonhealth.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.it.xzr.mothersonhealth.R;

import java.util.List;

/**
 * Created by Administrator on 2017/5/25 0025.
 */

public class YEXinShengErWeiYangFangShiAdapter extends BaseAdapter {
    private List<String> data;
    private Context context;

    public YEXinShengErWeiYangFangShiAdapter(List<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_ye_xinshenger_weiyangfangshi, null);
        TextView content = (TextView) convertView.findViewById(R.id.tv_item_ye_xinshenger_weiyangfangshi);
        content.setText(data.get(position));
        return convertView;
    }
}
