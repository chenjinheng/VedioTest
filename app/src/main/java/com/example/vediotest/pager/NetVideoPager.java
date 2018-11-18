package com.example.vediotest.pager;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.example.vediotest.base.BasePager;

/**
 * Created by 陈金桁 on 2018/11/18.
 */

public class NetVideoPager extends BasePager {
    private TextView textView;
    public NetVideoPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        textView = new TextView(context);
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        textView.setText("网络视频");
    }
}
