package com.doudou.cn.shoppingim.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.doudou.cn.shoppingim.R;
import com.doudou.cn.shoppingim.fragment.ConvenientFragment;
import com.doudou.cn.shoppingim.fragment.HomeFragment;
import com.doudou.cn.shoppingim.fragment.SettingFragment;
import com.doudou.cn.shoppingim.fragment.SmallTreasuriesFragment;
import com.doudou.cn.shoppingim.fragment.base.ClassificationFragment;

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

    private HomeFragment homeFragment;//首页界面
    private ConvenientFragment convenientFragment;// 便民模块

    private ClassificationFragment classificationFragment;//分类模块

    private SmallTreasuriesFragment smallTreasuriesFragment;//小金库
    private SettingFragment settingFragment;// 设置界面
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
        initView();
    }

    private void initView() {
        homeFragment = HomeFragment.getInstance();
        // fragmentManager之间的切换替换布局文件的内容
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.main_fragment, homeFragment).addToBackStack(null).commit();
    }

    /**
     * 点击四个Tab选项之间进行切换
     */
    @OnClick(R.id.oneTab)
    public void oneTabClick() {
        changeTabFragment(1);
    }

    @OnClick(R.id.secondTab)
    public void secondTabClick() {
        changeTabFragment(2);
    }

    @OnClick(R.id.thirdTab)
    public void thirdTabClick() {
        changeTabFragment(3);
    }

    @OnClick(R.id.forthTab)
    public void forthTabClick() {
        changeTabFragment(4);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(MainActivity.this);
    }

    // 根据序号进行切换fragment的界面
    private void changeTabFragment(int tabIndex) {

        if (tabIndex == 1) { // 首页 模块
            if (homeFragment == null) {
                homeFragment = HomeFragment.getInstance();
            }
            fragmentManager.beginTransaction().replace(R.id.main_fragment, homeFragment).addToBackStack(null).commit();
        } else if (tabIndex == 2) {//便民服务 模块
            if (convenientFragment == null) {
                convenientFragment = ConvenientFragment.getInstance();
            }
            fragmentManager.beginTransaction().replace(R.id.main_fragment, convenientFragment).addToBackStack(null).commit();

        } else if (tabIndex == 3) {// 小金库模块

            if (smallTreasuriesFragment == null) {
                smallTreasuriesFragment = SmallTreasuriesFragment.getInstance();
            }
            fragmentManager.beginTransaction().replace(R.id.main_fragment, smallTreasuriesFragment).addToBackStack(null).commit();

        } else if (tabIndex == 4) {// 设置 模块
            if (settingFragment == null) {
                settingFragment = SettingFragment.getInstance();
            }
            fragmentManager.beginTransaction().replace(R.id.main_fragment, settingFragment).addToBackStack(null).commit();
        }

    }

}
