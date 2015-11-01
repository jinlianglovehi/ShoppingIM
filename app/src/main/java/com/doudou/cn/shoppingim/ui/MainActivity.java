package com.doudou.cn.shoppingim.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.doudou.cn.shoppingim.R;
import com.doudou.cn.shoppingim.fragment.SettingFragment;
import com.doudou.cn.shoppingim.tools.ToastUtils;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jinliang on 15/11/1.
 * 应用的主界面
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.oneTab)
    TextView oneTab;
    @Bind(R.id.secondTab)
    TextView secondTab;
    @Bind(R.id.thirdTab)
    TextView thirdTab;
    @Bind(R.id.forthTab)
    TextView forthTab;
    @Bind(R.id.bottomBar)
    LinearLayout bottomBar;
    @Bind(R.id.main_fragment)
    FrameLayout mainFragment;

    //设置界面
    private SettingFragment settingFragment;

    protected List<Fragment> listFragment;
    private  FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
        initView();

    }

    private void initView() {
        settingFragment = new SettingFragment(getApplicationContext());
        // fragmentManager之间的切换替换布局文件的内容
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.main_fragment, settingFragment).addToBackStack(null).commit();
    }


    /**
     * 点击四个Tab选项之间进行切换
     */
    @OnClick(R.id.oneTab)
    public void oneTabClick() {
        ToastUtils.show(MainActivity.this, "第一板块");
    }

    @OnClick(R.id.secondTab)
    public void secondTabClick() {

    }

    @OnClick(R.id.thirdTab)
    public void thirdTabClick() {

    }

    @OnClick(R.id.forthTab)
    public void forthTabClick() {


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(MainActivity.this);
    }
}
