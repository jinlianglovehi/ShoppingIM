package com.doudou.cn.shoppingim.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.doudou.cn.shoppingim.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinliang on 15/10/31.
 * 创建基础类方法
 * 创建的基础的标题的内容
 */
public class BaseActivity extends Activity {

    @Bind(R.id.leftBtn)
    protected TextView leftBtn;
    @Bind(R.id.middleBtn)
    protected TextView middleBtn;
    @Bind(R.id.rightBtn)
    protected TextView rightBtn;
    @Bind(R.id.contentFragment)
    protected FrameLayout contentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_title_bar);
        ButterKnife.bind(this);
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
    protected  void showLeftAndRight(){
        showLeftBtn(true);
        showRightBtn(true);
    }

    protected  void showLeftBtn(boolean isShow){
        if(isShow){
            leftBtn.setVisibility(View.VISIBLE);
        }else {
            leftBtn.setVisibility(View.GONE);
        }
    }

    protected  void showRightBtn(boolean isShow){
        if(isShow){
            rightBtn.setVisibility(View.VISIBLE);
        }else {
            rightBtn.setVisibility(View.GONE);
        }
    }

    // 设置左侧按钮的内容
    protected  void setLeftText(int leftContent){
        leftBtn.setText(leftContent);
    }
    // 设置右侧的文字
    protected  void setRightText(int rightContext){
        rightBtn.setText(rightContext);
    }
    // 显示中间的文字
    protected  void setMiddleText(int middleContext){
        middleBtn.setVisibility(View.VISIBLE);
        middleBtn.setText(middleContext);
    }
}
