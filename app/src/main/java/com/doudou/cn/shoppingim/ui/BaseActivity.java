package com.doudou.cn.shoppingim.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.doudou.cn.shoppingim.R;

/**
 * Created by jinliang on 15/10/31.
 * 创建基础类方法
 * 创建的基础的标题的内容
 */
public class BaseActivity extends FragmentActivity {

    protected TextView leftBtn;
    protected TextView middleBtn;
    protected TextView rightBtn;
    protected FrameLayout contentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        super.setContentView(R.layout.activity_title_bar);
        initView();
    }

    private void initView() {
        leftBtn = (TextView) findViewById(R.id.leftBtn);
        middleBtn = (TextView) findViewById(R.id.middleBtn);
        rightBtn = (TextView) findViewById(R.id.rightBtn);
        contentFragment = (FrameLayout) findViewById(R.id.contentFragment);
    }

    // 取出FrameLayout并调用父类removeAllViews()方法
    @Override
    public void setContentView(int layoutResID) {
        contentFragment.removeAllViews();
        View.inflate(this, layoutResID, contentFragment);
        onContentChanged();
    }

    @Override
    public void setContentView(View view) {
        contentFragment.removeAllViews();
        contentFragment.addView(view);
        onContentChanged();
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        contentFragment.removeAllViews();
        contentFragment.addView(view, params);
        onContentChanged();
    }

    //    两边的按钮都显示
    protected void showLeftAndRight() {
        showLeftBtn(true);
        showRightBtn(true);
    }

    protected void showLeftBtn(boolean isShow) {
        if (isShow) {
            leftBtn.setVisibility(View.VISIBLE);
        } else {
            leftBtn.setVisibility(View.GONE);
        }
    }

    protected void showRightBtn(boolean isShow) {
        if (isShow) {
            rightBtn.setVisibility(View.VISIBLE);
        } else {
            rightBtn.setVisibility(View.GONE);
        }
    }

    // 设置左侧按钮的内容
    protected void setLeftText(int leftContent) {
        leftBtn.setText(leftContent);
    }

    // 设置右侧的文字
    protected void setRightText(int rightContext) {
        rightBtn.setText(rightContext);
    }

    // 显示中间的文字
    protected void setMiddleText(int middleContext) {
        middleBtn.setVisibility(View.VISIBLE);
        middleBtn.setText(middleContext);
    }
}
