package com.doudou.cn.shoppingim.fragment.base;

import android.view.LayoutInflater;
import android.view.View;

import com.doudou.cn.shoppingim.R;

/**
 * Created by jinliang on 15/11/2.
 *  进行产品的分类的操作
 *   仿照多点的界面进行修改
 */
public class ClassificationFragment  extends BaseFragment{
    private  static  ClassificationFragment instance ;

    public static ClassificationFragment getInstance(){
        if(instance==null){
            instance = new ClassificationFragment();
        }
        return instance;
    }

    @Override
    protected View initView() {

        view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_classification,null);
        return view;
    }

    @Override
    protected void initData() {

    }
}
