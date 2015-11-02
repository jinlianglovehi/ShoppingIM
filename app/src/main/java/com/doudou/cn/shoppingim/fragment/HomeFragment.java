package com.doudou.cn.shoppingim.fragment;

import android.view.LayoutInflater;
import android.view.View;

import com.doudou.cn.shoppingim.R;
import com.doudou.cn.shoppingim.fragment.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * Created by jinliang on 15/11/2.
 * 首页的fragment  主要提供大部分的分类的重要的功能
 *
 */
public class HomeFragment extends BaseFragment {

    public static HomeFragment instance;

    public static HomeFragment getInstance() {

        if (instance == null) {
            instance = new HomeFragment();
        }
        return instance;
    }

    @Override
    protected View initView() {
        view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_home, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {


    }
}
