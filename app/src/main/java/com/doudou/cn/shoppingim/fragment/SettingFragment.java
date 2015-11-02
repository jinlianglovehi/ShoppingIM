package com.doudou.cn.shoppingim.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.doudou.cn.shoppingim.R;
import com.doudou.cn.shoppingim.fragment.base.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinliang on 15/11/1.
 * 设置界面的fragment  提供的功能是：自己的设计界面以及微信和淘宝的支付功能
 *
 */
public class SettingFragment extends BaseFragment {

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

    public static SettingFragment instance;

    public static SettingFragment getInstance() {
        if (instance == null) {
            instance = new SettingFragment();
        }
        return instance;
    }

    @Override
    protected View initView() {
        view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_setting, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
