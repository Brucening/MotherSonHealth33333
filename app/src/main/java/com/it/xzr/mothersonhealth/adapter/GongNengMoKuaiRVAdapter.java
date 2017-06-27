package com.it.xzr.mothersonhealth.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.entity.GongNengMoKuaiItem;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2017/6/27.
 */

public class GongNengMoKuaiRVAdapter extends RecyclerView.Adapter<GongNengMoKuaiRVAdapter.MyHolder> {
    private Context context;
    private List<GongNengMoKuaiItem> data;

    public GongNengMoKuaiRVAdapter(Context context, List<GongNengMoKuaiItem> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.activity_main_gong_neng_mo_kuai_item, null));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        Picasso.with(context).load(data.get(position).getImgUrl()).into(holder.img);
        holder.text.setText(data.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView text;

        public MyHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.iv_activity_main_gong_neng_mo_kuai_item_img);
            text = (TextView) itemView.findViewById(R.id.iv_activity_main_gong_neng_mo_kuai_item_text);

        }
    }
}
