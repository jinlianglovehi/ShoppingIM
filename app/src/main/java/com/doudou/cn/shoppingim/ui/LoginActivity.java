package com.doudou.cn.shoppingim.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.doudou.cn.shoppingim.R;
import com.doudou.cn.shoppingim.tools.ToastUtils;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jinliang on 15/11/1.
 * 登陆界面
 */
public class LoginActivity extends BaseActivity {
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
        Log.i("解决冲突的地方","有冲突");
        //cauhfauisdhfauisdhfasdhui
    }

    /**
     * 处等级按钮的实现逻辑
     */
    @OnClick(R.id.loginBtn)
    public void loginBtnClick() {
        // 进入主界面
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();

    }

    @OnClick(R.id.forget_password)
    public void forgetPassword() {
        ToastUtils.show(LoginActivity.this, "忘记密码模块尚未开发");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(LoginActivity.this);
    }
}
