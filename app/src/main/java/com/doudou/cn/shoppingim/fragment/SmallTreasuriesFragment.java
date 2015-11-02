package com.doudou.cn.shoppingim.fragment;

import android.view.LayoutInflater;
import android.view.View;

import com.doudou.cn.shoppingim.R;
import com.doudou.cn.shoppingim.fragment.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * Created by jinliang on 15/11/2.、
 * 小金库的界面
 */
public class SmallTreasuriesFragment extends BaseFragment {

    private static SmallTreasuriesFragment instance;
    public static SmallTreasuriesFragment getInstance() {
        if (instance == null) {
            instance = new SmallTreasuriesFragment();
        }
        return instance;
    }

    @Override
    protected View initView() {
        view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_smalltreasuries,null);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    protected void initData() {

    }
}
