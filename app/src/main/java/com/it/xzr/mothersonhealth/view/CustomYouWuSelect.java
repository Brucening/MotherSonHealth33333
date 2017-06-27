package com.it.xzr.mothersonhealth.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.it.xzr.mothersonhealth.R;

/**
 * Created by Administrator on 2017/5/25 0025.
 */

public class CustomYouWuSelect extends LinearLayout {
    public CustomYouWuSelect(Context context) {
        super(context);
    }

    private CheckBox checkBox;
    private boolean state = false;
    private CustomYouWuSelect other, other1;

    public CustomYouWuSelect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.custom_you_wu_select, this, true);
        TextView textView = (TextView) findViewById(R.id.tv_custom_you_wu_select);
        checkBox = (CheckBox) findViewById(R.id.cb_custom_you_wu_select);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomYouWuSelect);
        for (int i = 0; i < typedArray.getIndexCount(); i++) {
            if (typedArray.getIndex(i) == R.styleable.CustomYouWuSelect_CustomYouWuSelectContent) {
                textView.setText(typedArray.getString(typedArray.getIndex(i)));
            } else if (typedArray.getIndex(i) == R.styleable.CustomYouWuSelect_CustomYouWuSelectCheckState) {
                if ("true".equals(typedArray.getString(typedArray.getIndex(i)))) {
                    state = true;
                    checkBox.setChecked(true);
                } else if ("false".equals(typedArray.getString(typedArray.getIndex(i)))) {
                    state = false;
                    checkBox.setChecked(false);
                }
            }
        }
        checkBox.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!state) {
                    checkBox.setChecked(true);
                    state = true;
                    other.getCheckBox().setChecked(false);
                    other.setState(false);
                    if (other1 != null) {
                        other1.getCheckBox().setChecked(false);
                        other1.setState(false);
                    }
                } else if (state) {
                    checkBox.setChecked(false);
                    state = false;
                }

            }
        });
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }


    public void setOther(CustomYouWuSelect other, CustomYouWuSelect other1) {
        this.other = other;
        this.other1 = other1;
    }
}
