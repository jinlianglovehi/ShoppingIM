package com.doudou.cn.shoppingim.tools;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by jinliang on 15/11/1.
 * toast 的封装
 */
public class ToastUtils {

    private ToastUtils()
    {
        throw new UnsupportedOperationException("cannot be instantiated");
    }
    private static final boolean isShow=true;
    public static void show(Context context,String strContext) {
        if(isShow) {
            Toast.makeText(context, strContext, Toast.LENGTH_SHORT).show();
        }
    }
}
