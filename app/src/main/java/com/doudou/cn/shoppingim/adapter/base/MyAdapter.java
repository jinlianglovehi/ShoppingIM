package com.doudou.cn.shoppingim.adapter.base;

import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by jinliang on 15/11/1.
 * 基础的工具类
 *
 */

public  abstract  class MyAdapter<T> extends android.widget.BaseAdapter {

    protected List<T> list ;

    public MyAdapter(List<T> list) {
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract View getView(int position, View convertView, ViewGroup parent) ;

}
