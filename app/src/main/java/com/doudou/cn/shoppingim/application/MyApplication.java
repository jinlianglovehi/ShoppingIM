package com.doudou.cn.shoppingim.application;

import android.app.Application;

import im.fir.sdk.FIR;

/**
 * Created by jinliang on 15/11/2.
 */
public class MyApplication  extends Application{
    @Override
    public void onCreate() {
        FIR.init(this);
        super.onCreate();
    }
}
