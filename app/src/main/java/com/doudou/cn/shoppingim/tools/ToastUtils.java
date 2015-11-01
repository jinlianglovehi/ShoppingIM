package com.doudou.cn.shoppingim.tools;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by jinliang on 15/11/1.
 * toast 的封装
 */
public abstract class ToastUtils {

    private boolean isShow = true;

    public void show(Context context) {
        if (isShow) {
            Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
        }
    }
}
