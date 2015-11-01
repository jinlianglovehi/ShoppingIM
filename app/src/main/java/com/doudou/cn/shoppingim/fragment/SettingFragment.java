package com.doudou.cn.shoppingim.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.doudou.cn.shoppingim.R;
import com.doudou.cn.shoppingim.fragment.base.BaseFragment;

/**
 * Created by jinliang on 15/11/1.
 * 设置界面的fragment
 */
public class SettingFragment extends BaseFragment {

    public SettingFragment(Context context) {
        this.context = context;
    }

    @Override
    protected View initView() {
        view = LayoutInflater.from(context).inflate(R.layout.fragment_setting, null);
        return view;
    }

    @Override
    protected void initData() {

    }
}
