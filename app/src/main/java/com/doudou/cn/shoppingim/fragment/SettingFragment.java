package com.doudou.cn.shoppingim.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.doudou.cn.shoppingim.R;
import com.doudou.cn.shoppingim.fragment.base.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinliang on 15/11/1.
 * 设置界面的fragment
 */
public class SettingFragment extends BaseFragment {

    /**
     * titileBar 的设置界面
     */
    @Bind(R.id.leftBtn)
    TextView leftBtn;
    @Bind(R.id.middleBtn)
    TextView middleBtn;
    @Bind(R.id.rightBtn)
    TextView rightBtn;

    /**
     * fragment内容
     */
    @Bind(R.id.image_avator)
    ImageView imageAvator;
    @Bind(R.id.app_version)
    TextView appVersion;
    @Bind(R.id.help)
    TextView help;
    @Bind(R.id.about_us)
    TextView aboutUs;

    public SettingFragment(Context context) {
        this.context = context;
    }

    @Override
    protected View initView() {
        view = LayoutInflater.from(context).inflate(R.layout.fragment_setting, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        initFragmentView();
        return rootView;
    }

    private void initFragmentView() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
