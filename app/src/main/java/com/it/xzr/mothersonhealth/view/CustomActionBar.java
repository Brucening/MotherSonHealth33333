package com.it.xzr.mothersonhealth.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.it.xzr.mothersonhealth.R;

/**
 * Created by Administrator on 2017/5/23 0023.
 */

public class CustomActionBar extends RelativeLayout {
    private ImageView back;

    public CustomActionBar(Context context) {
        super(context);
    }

    public CustomActionBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.custom_actionbar, this, true);
        RelativeLayout actionbar = (RelativeLayout) findViewById(R.id.rl_custom_actionbar);
        back = (ImageView) findViewById(R.id.iv_custom_back);
        TextView content = (TextView) findViewById(R.id.tv_custom_content);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CustomActionBar);

        for (int i = 0; i < array.getIndexCount(); i++) {
            switch (array.getIndex(i)) {
                case R.styleable.CustomActionBar_ActionBarBackground:
                    actionbar.setBackgroundColor(array.getColor(R.styleable.CustomActionBar_ActionBarBackground, 0));
                    break;
                case R.styleable.CustomActionBar_ActionBarContent:
                    content.setText(array.getResourceId(R.styleable.CustomActionBar_ActionBarContent, 0));
                    break;
            }
        }
        array.recycle();
    }

    public void setOnBackClickListener(final Activity activity) {
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.finish();
            }
        });
    }

}
