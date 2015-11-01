package com.doudou.cn.shoppingim.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.doudou.cn.shoppingim.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jinliang on 15/11/1.
 * 登陆界面
 */
public class LoginActivity extends BaseActivity{
    @Bind(R.id.tv_mobile_phone)
    TextView tvMobilePhone;
    @Bind(R.id.et_moile_phone)
    EditText etMoilePhone;
    @Bind(R.id.tv_mobile_password)
    TextView tvMobilePassword;
    @Bind(R.id.et_moile_password)
    EditText etMoilePassword;
    @Bind(R.id.loginBtn)
    Button loginBtn;
    @Bind(R.id.forget_password)
    TextView forgetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(LoginActivity.this);
    }

    /**
     * 处等级按钮的实现逻辑
     */
    @OnClick(R.id.loginBtn)
    public void loginBtnClick() {

    }
    @OnClick(R.id.forget_password)
    public void forgetPassword(){

        Toast.makeText(LoginActivity.this, "", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(LoginActivity.this);
    }
}
