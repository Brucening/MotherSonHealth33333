package com.it.xzr.mothersonhealth.activity.yunqian;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.it.xzr.mothersonhealth.R;
import com.it.xzr.mothersonhealth.adapter.XinXiAdapter;
import com.it.xzr.mothersonhealth.fragment.yunqian.BeiYunFatherFragment;
import com.it.xzr.mothersonhealth.fragment.yunqian.BeiYunMotherFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GN on 2017/5/27.
 */

public class YunJianActivity extends FragmentActivity{
    private List<Fragment> mFragmentList = new ArrayList<Fragment>();
    private XinXiAdapter mXinxiAdapter;
    private ViewPager m_vp;
    /**
     * Tab显示内容TextView*/
    private TextView mTabChatTv,mTabFriendTv;
    /**
     * Tab的那个引导线*/
    private ImageView mTabLineIv;
    /**
     * Fragemt*/
    private BeiYunMotherFragment beimotherFragment;
    private BeiYunFatherFragment beifatherFragment;
    /**
     * ViewPager的当前选中页*/
    private int currentIndex;
    /**
     * 屏幕的宽度*/
    private int screenWidth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yunjian);
        findById();
        init();
        initTabLineWidth();
    }
    /**
     * 设置滑动条的宽度为屏幕的1/3(根据Tab的个数而定)
     */
    private void initTabLineWidth() {
        DisplayMetrics dpMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay()
                .getMetrics(dpMetrics);
        screenWidth = dpMetrics.widthPixels;
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) mTabLineIv
                .getLayoutParams();
        lp.width = screenWidth / 2;
        mTabLineIv.setLayoutParams(lp);
    }

    private void init() {
        beimotherFragment = new BeiYunMotherFragment();
        beifatherFragment = new BeiYunFatherFragment();
        mFragmentList.add(beimotherFragment);
        mFragmentList.add(beifatherFragment);

        mXinxiAdapter = new XinXiAdapter(
                this.getSupportFragmentManager(),mFragmentList);
        m_vp.setAdapter(mXinxiAdapter);
        m_vp.setCurrentItem(0);

        m_vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /**
             * position:当前页面，以及你点击滑动的页面  offset:当前页面偏移的百分比
             * offsetPixels:当前页面偏移的像素位置*/
            @Override
            public void onPageScrolled(int position, float offset, int offsetPixels) {
                LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) mTabLineIv.getLayoutParams();
                Log.e("offset:", offset + "");
                /**
                 * 利用currentIndex(当前所在页面)和position(下一个页面)以及offset来
                 * 设置mTabLineIv的左边距 滑动场景：
                 * 记3个页面,
                 * 从左到右分别为0,1,2
                 * 0->1; 1->2; 2->1; 1->0
                 */

                if (currentIndex == 0 && position == 0)// 0->1
                {
                    lp.leftMargin = (int) (offset * (screenWidth * 1.0 / 2) + currentIndex
                            * (screenWidth / 2));

                } else if (currentIndex == 1 && position == 0) // 1->0
                {
                    lp.leftMargin = (int) (-(1 - offset)
                            * (screenWidth * 1.0 / 2) + currentIndex
                            * (screenWidth / 2));

                } else if (currentIndex == 1 && position == 1) // 1->2
                {
                    lp.leftMargin = (int) (offset * (screenWidth * 1.0 / 2) + currentIndex
                            * (screenWidth / 2));
                }
                mTabLineIv.setLayoutParams(lp);

            }

            /**
             * state滑动中的状态  有两种状态（0,1,2）1：正在滑动 2：滑动完毕 0：什么都没做*/
            @Override
            public void onPageSelected(int position) {
                resetTextView();
                switch (position) {
                    case 0:
                        mTabChatTv.setTextColor(Color.RED);
                        break;
                    case 1:
                        mTabFriendTv.setTextColor(Color.RED);
                        break;
                }
                currentIndex = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    /**
     * 重置颜色
     */
    private void resetTextView() {
        mTabChatTv.setTextColor(Color.BLACK);
        mTabFriendTv.setTextColor(Color.BLACK);

    }

    private void findById() {
        mTabChatTv = (TextView) this.findViewById(R.id.id_chat_tv);
        mTabFriendTv = (TextView) this.findViewById(R.id.id_friend_tv);

        mTabLineIv = (ImageView) this.findViewById(R.id.id_tab_line_iv);
        m_vp = (ViewPager) this.findViewById(R.id.viewpager_yunjian);

        mTabChatTv.setOnClickListener(new txtListener(0));
        mTabFriendTv.setOnClickListener(new txtListener(1));
    }
    //内部类   重写TextView点击事件
    public class txtListener implements View.OnClickListener{
        private int index=0;
        public txtListener(int i){
            index = i;
        }
        @Override
        public void onClick(View view) {
            m_vp.setCurrentItem(index);
        }
    }
}
