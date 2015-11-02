package com.doudou.cn.shoppingim.fragment;

import android.view.LayoutInflater;
import android.view.View;

import com.doudou.cn.shoppingim.R;
import com.doudou.cn.shoppingim.fragment.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * Created by jinliang on 15/11/2.
 * 便民服务专栏
 * 主要的功能是：提供一些缴费的小服务。
 */
public class ConvenientFragment extends BaseFragment {

    private static ConvenientFragment instance;

    public static ConvenientFragment getInstance() {

        if (instance == null) {
            instance = new ConvenientFragment();
        }
        return instance;
    }

    @Override
    protected View initView() {
        view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_convenient, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {




    }
}
