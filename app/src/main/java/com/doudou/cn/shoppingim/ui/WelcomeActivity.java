package com.doudou.cn.shoppingim.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.doudou.cn.shoppingim.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jinliang on 15/10/31.
 */
public class WelcomeActivity extends Activity {

    @Bind(R.id.app_icon)
    ImageView appIcon;
    @Bind(R.id.enter_app)
    Button enterApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(WelcomeActivity.this);


    }

    /**
     *开始打开app 应用的界面
     */
    @OnClick(R.id.enter_app)
    public void enterApp(){
        startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(WelcomeActivity.this);
    }
}
